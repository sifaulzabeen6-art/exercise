/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalpatient;

/**
 *
 * @author user
 */
public class PatientRecord {
    private String patientname;
    private int age;
    private String disease;
    private String doctorname;
    private String roomtype;
    private double billamount;

    private PatientRecord(Builder builder) {
        this.patientname = builder.patientname;
        this.age = builder.age;
        this.disease = builder.disease;
        this.doctorname =builder. doctorname;
        this.roomtype = builder.roomtype;
        this.billamount = builder.billamount;
    }
    public void details(){
        System.out.println("***************");
        System.out.println("patient name:"+patientname);
        System.out.println("age"+age);
        System.out.println("DISEASE"+disease);
        System.out.println("DOC NAME"+doctorname);
        System.out.println("ROOM TYPE"+roomtype);
        System.out.println("BILL AMOUNT"+billamount);
    
    
    
    }
    static class Builder{
        private String patientname;
    private int age;
    private String disease;
    private String doctorname;
    private String roomtype;
    private double billamount;
    
    

    public Builder setPatientname(String patientname) {
        this.patientname = patientname;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setDisease(String disease) {
        this.disease = disease;
        return this;
    }

    public Builder setDoctorname(String doctorname) {
        this.doctorname = doctorname;
        return this;
    }

    public Builder setRoomtype(String roomtype) {
        this.roomtype = roomtype;
        return this;
    }

    public Builder setBillamount(double billamount) {
        this.billamount = billamount;
        return this;
    }

       public PatientRecord build() {
            return new PatientRecord(this);
       }
    }
    
}
