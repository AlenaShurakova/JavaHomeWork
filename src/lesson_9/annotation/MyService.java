package lesson_9.annotation;


@Version(versionNumber = "1.2", versionName = "Nougat")
public class MyService {
    private String serviceName;
    private int numberOfUsers;
    private static int classCounter = 0;
    private int instanceCounter;

    public MyService() {
        classCounter++;
        instanceCounter = classCounter;
    }

    private void thisClassInfo() {
        System.out.println("Service Name: " + serviceName + "; Number of users: " + numberOfUsers);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public boolean equals(Object service) {
        if (service.getClass() == this.getClass()) {
            if (this.serviceName == ((MyService) service).getServiceName()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return instanceCounter;
    }
}