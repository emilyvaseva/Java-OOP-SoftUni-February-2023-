package robotService.core;

import robotService.common.ConstantMessages;
import robotService.common.ExceptionMessages;
import robotService.entities.robot.FemaleRobot;
import robotService.entities.robot.MaleRobot;
import robotService.entities.robot.Robot;
import robotService.entities.services.MainService;
import robotService.entities.services.SecondaryService;
import robotService.entities.services.Service;
import robotService.entities.supplements.MetalArmor;
import robotService.entities.supplements.PlasticArmor;
import robotService.entities.supplements.Supplement;
import robotService.repositories.SupplementRepository;

import java.util.ArrayList;
import java.util.Collection;

public class ControllerImpl implements Controller {
    private SupplementRepository supplements;
    private Collection<Service> services;

    public ControllerImpl() {
        this.supplements = new SupplementRepository();
        this.services = new ArrayList<>();
    }

    @Override
    public String addService(String type, String name) {
        Service service;
        if (type.equals("MainService")){
            service=new MainService(name);
        }else if (type.equals("SecondaryService")){
            service=new SecondaryService(name);
        }else {
            throw new NullPointerException(ExceptionMessages.INVALID_SERVICE_TYPE);
        }
        this.services.add(service);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_SERVICE_TYPE,type);
    }

    @Override
    public String addSupplement(String type) {
        Supplement supplement;
        if (type.equals("PlasticArmor")){
            supplement=new PlasticArmor();
        }else if (type.equals("MetalArmor")){
            supplement=new MetalArmor();
        }else {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_SUPPLEMENT_TYPE);
        }
        this.supplements.addSupplement(supplement);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_SUPPLEMENT_TYPE,type);
    }

    @Override
    public String supplementForService(String serviceName, String supplementType) {
        Supplement supplement = this.supplements.findFirst(supplementType);
        if (supplement==null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.NO_SUPPLEMENT_FOUND,supplementType));
        }
        Service service = getServiceByName(serviceName);
        service.addSupplement(supplement);

        this.services.remove(service);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_SUPPLEMENT_IN_SERVICE,supplementType,serviceName);
    }

    private Service getServiceByName(String serviceName){
        return this.services.stream()
                .filter(service -> service.getName().equals(serviceName))
                .findFirst()
                .get();
    }

    @Override
    public String addRobot(String serviceName, String robotType, String robotName, String robotKind, double price) {
        Robot robot;
        switch (robotType){
            case "MaleRobot":
                robot=new MaleRobot(robotName,robotKind,price);
                break;
            case "FemaleRobot":
                robot=new FemaleRobot(robotName,robotKind,price);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_ROBOT_TYPE);
        }
        Service service = getServiceByName(serviceName);

        // female  Can only live in SecondaryService!
        //male  Can only live in MainService!

        boolean checkMale = robotType.startsWith("Male") && service.getClass().getSimpleName().startsWith("Male");
        boolean checkFemale = robotType.startsWith("Female") && service.getClass().getSimpleName().startsWith("Female");

        if (checkMale || checkFemale){
            service.addRobot(robot);
        }else {
            return ConstantMessages.UNSUITABLE_SERVICE;
        }
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_ROBOT_IN_SERVICE,robotType,serviceName);
    }

    @Override
    public String feedingRobot(String serviceName) {
        Service service = getServiceByName(serviceName);
        service.feeding();

        return String.format(ConstantMessages.FEEDING_ROBOT,service.getRobots().size());
    }

    @Override
    public String sumOfAll(String serviceName) {
        Service service = getServiceByName(serviceName);
        double priceRobots = service.getRobots().stream().mapToDouble(Robot::getPrice).sum();
        double priceSupplements = service.getSupplements().stream().mapToDouble(Supplement::getPrice).sum();
        double priceAll = priceRobots + priceSupplements;

        return String.format(ConstantMessages.VALUE_SERVICE,serviceName,priceAll);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb= new StringBuilder();
        services.forEach(s -> sb.append(s.getStatistics()).append(System.lineSeparator()));
        return sb.toString().trim();
    }
}
