/**
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class AppointmentDriver {
    public static void main(String[] args) {
        Appointment appointment = new Appointment();

        System.out.println("After default constructor: " + appointment);

        appointment.setDate(new AppointmentDate(9, 4, 2014));
        appointment.setStartTime(new AppointmentTime(16, 0, 0));
        appointment.setEndTime(new AppointmentTime(17, 0, 0));

        System.out.println("After calling mutators: " + appointment);
    }
}