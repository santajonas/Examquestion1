import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceBook {


    List<Service> serviceList = new ArrayList<>();

    public void addService(Service service) {
        serviceList.add(service);
    }

    public int getNumberOfServices() {
        return serviceList.size();
    }

    public Service getService(int index) {
        return serviceList.get(index);
    }

    public Service[] getAllServices() {

        Service[] services = new Service[serviceList.size()];
        int i = 0;
        for (Service service : serviceList) {
            services[i] = service;
            i++;
        }
        return services;
    }

    public List<Integer> getAllServiceMileages() {
        //new list of mileages from ServiceBook
        List<Integer> mileages = new ArrayList<>();

        for (Service element : serviceList) {
            mileages.add(element.getMileage());
        }
        return mileages;
    }

    public boolean hasServiceOnDate(Date date) {
        for (Service element: serviceList) {
            if(element.equals(date)) return true;
        }

        return false;
    }

    public Date getDateOfLastService() {
        Date temp = new Date(1,1, 0);
        for (Service element:serviceList) {
            if(element.getDate().isAfter((temp))) {
                temp = element.getDate();
            }
        }
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)  return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceBook that = (ServiceBook) o;
        return Objects.equals(serviceList, that.serviceList);
    }

    @Override
    public String toString() {
        return serviceList.toString();
    }
}

