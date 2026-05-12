/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalpatient;

/**
 *
 * @author user
 */
public class HospitalPatient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PatientRecord patient=new PatientRecord.Builder().setPatientname("sifa").setAge(21).setDisease("fever").setDoctorname("sulaiman").setRoomtype("ac").setBillamount(200000).build();
        patient.details();
    }
    
}
