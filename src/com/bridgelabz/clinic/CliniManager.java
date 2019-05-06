package com.bridgelabz.clinic;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class CliniManager implements ClinicInterface{
	static Scanner sc=new Scanner(System.in);
	static ObjectMapper objectMapper=new ObjectMapper();
	private static ClinicUtil CliniqueUtility;
	public static void main(String[] args) 
	{
		Doctor doctor = new Doctor();
		Patient patient = new Patient();
		
		try {
			List<Appointment> appointmentList =objectMapper.readValue(new File(doctorFile), new TypeReference<List<Doctor>>() {});
			List<Patient> patientsList=objectMapper.readValue(new File(patientFile), new TypeReference<List<Patient>>() {});
			List<Doctor> doctorsList=objectMapper.readValue(new File(doctorFile),new TypeReference<List<Doctor>>(){} );
		
			boolean value = true;
			while(value){
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Enter the choice");
				System.out.println("1. Add Doctor");
				System.out.println("2. Add Patient");
				System.out.println("3. See Doctors");
				System.out.println("4. See Patients");
				System.out.println("5. Search Doctors");
				System.out.println("6. Search Patients");
				System.out.println("7. Take Appointment");
				System.out.println("8. Print Appointment Reports");
				System.out.println("9. Popular Doctor in Clinic!");
				System.out.println("10.Our Popular Specialization!");
				System.out.println("11.Exit");
				System.out.println("-----------------------------------------------------------------------");
				
				int choice =sc.nextInt();
				switch (choice) {
				
				case 1: ClinicUtil.addDocter(doctorsList);
				break;
		
				case 2: ClinicUtil.addPatient(patientsList);
				break;
			
				case 3: System.out.printf("\n%-15s %-10s  %-15s %15s\n", "Doctor Name", "Doctor Id", "Specialization", "Availability");
				System.out.println("----------------------------------------------------------------------");
				for(int i = 0; i < doctorsList.size(); i++){
					doctor = doctorsList.get(i);
					System.out.println(doctor.toString());
				}
				break;
			
				case 4: System.out.printf("\n%-15s %-10s  %-15s %15s\n", "Patient Name", "Patient Id", "Mobile Number", "Age");
				System.out.println("------------------------------------------------------------------------");
				for(int i = 0; i < patientsList.size(); i++){
					patient = patientsList.get(i);
					System.out.println(patient.toString());
				}
				break;
			
				case 5: ClinicUtil.searchDoctor(doctorsList);
				break;
		
				case 6: ClinicUtil.searchPatient(patientsList);
				break;
			
				case 7: ClinicUtil.fixAppointment(doctorsList, patientsList);
				break;
			
				case 8: ClinicUtil.printAppointments(appointmentList);
				break;
			
				case 9 :if(doctorsList.isEmpty()){
							System.out.println("Doctors are not available at this time\n");
						}
						else{
							System.out.println("Popular Doctor is " + doctorsList.get(0).getName()+ "\n");
						}
				break;
	
				case 10 : if(doctorsList.isEmpty()){
								System.out.println("Doctors are not available at this time\n");
							}
							else{
								System.out.println("Popular Specialization is "+ doctorsList.get(0).getSpecialization() + "\n");
							}
				break;
	
				case 11 :value = false;
				break;
				} 
			}
		}catch (Exception e) {
			e.printStackTrace();
			} 
	}
}