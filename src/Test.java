public class Test {
    public static void main(String[] args){
        ServiceBook serviceBook = new ServiceBook();
        Date date1 = new Date(15, 12, 2018);
        Date date2 = new Date(1, 10, 2018);
        Date date3 = new Date(30, 1, 2017);
        Date date4 = new Date(1, 1, 2019);
        Date date5 = new Date(25, 9, 2018);

        Service service1 = new Service(5641, date1);
        Service service2 = new Service(5416, date2);
        Service service3 = new Service(54789, date3);
        Service service4 = new Service(213, date4);
        Service service5 = new Service(213, date5);

        serviceBook.addService(service1);
        serviceBook.addService(service2);
        serviceBook.addService(service3);
        serviceBook.addService(service4);
        serviceBook.addService(service5);

        System.out.println(serviceBook.getDateOfLastService());



        System.out.println(serviceBook.toString());

        System.out.println(serviceBook.getAllServiceMileages());

        System.out.println(serviceBook.getAllServices());

    }
}
