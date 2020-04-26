public class Appointment {
    private AppointmentTime startTime, endTime;
    private AppointmentDate date;

    public Appointment(AppointmentTime startTime, AppointmentTime endTime, AppointmentDate date) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
    }

    public Appointment() {
        startTime = new AppointmentTime();
        endTime = new AppointmentTime();
        date = new AppointmentDate();
    }

    public AppointmentTime getStartTime() {
        return startTime;
    }

    public void setStartTime(AppointmentTime startTime) {
        this.startTime = startTime;
    }

    public AppointmentTime getEndTime() {
        return endTime;
    }

    public void setEndTime(AppointmentTime endTime) {
        this.endTime = endTime;
    }

    public AppointmentDate getDate() {
        return date;
    }

    public void setDate(AppointmentDate date) {
        this.date = date;
    }

    public String toString(){
        return date + ", " + startTime + " - " + endTime;
    }
}

