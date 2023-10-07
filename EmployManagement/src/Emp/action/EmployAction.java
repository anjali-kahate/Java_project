package Emp.action;

import java.lang.reflect.Array;
import java.util.ArrayList;
import Emp.Dao.EmployDao;
import Emp.model.EmployModel;

public class EmployAction {
	static ArrayList<EmployModel> arrayEmp=new ArrayList<>();
	public static void main(String args[])
	{
    	EmployAction e=new EmployAction();
   	// //Insert Record
	// 	EmployModel emp=e.addEmp();
	// 	 System.out.println(" Employ Record is:-"+emp);
	// 	 EmployDao emp1=new EmployDao();
	// 	 emp1.addemploy(emp);
   	
		 //Show Record
   	 EmployDao emp3=new EmployDao();
		ArrayList<EmployModel> ss=emp3.showemploy();
		for (EmployModel emp : ss) {
			e.showEmp(emp);
		}
    	
		//Update Record
//    	EmployModel em=e.updEmp();
//    	System.out.println(""+em);
//		 EmployDao ed=new EmployDao();
//		 ed.updateempRecord(em);
		 
		//  //Delete Record
    	// int eid=e.delEmp();
    	// EmployDao ed=new EmployDao();
    	// ed.deleteEmployRecord(eid);
    	
	}
   public static EmployModel addEmp()
   {
	   EmployModel e1=new EmployModel();
	   e1.setEmpName("anju");
	   e1.setEmpId(101);
	   e1.setEmpSalary((float) 5.3);
	   e1.setEmpPhone(123455);
	   e1.setEmpAddress("aurangabad");
	   
	   e1.setEmpName("Naval");
	   e1.setEmpId(102);
	   e1.setEmpSalary((float) 15.3);
	   e1.setEmpPhone(123455);
	   e1.setEmpAddress("pune");
	   
	   e1.setEmpName("anuja");
	   e1.setEmpId(103);
	   e1.setEmpSalary((float) 5.3);
	   e1.setEmpPhone(123455);
	   e1.setEmpAddress("aurangabad");
	     
	return e1;
   }
   public static EmployModel updEmp()
   {
	   System.out.println("update Employ record");
	   EmployModel e2=new EmployModel();
	   e2.setEmpName("rani");
	   e2.setEmpId(101);
	   e2.setEmpSalary((float) 3.3);
	   e2.setEmpPhone(123455);
	   e2.setEmpAddress("shankarpur");
	return e2;
	
   }
   public static int delEmp()
   {
	   System.out.println("delete record");
	   int a=101;
	return a;
   }
   public static void showEmp(EmployModel emp2)
   {
	   System.out.println("show Employ Record:-"); 
	   System.out.println("**************************************\n\n");
	   System.out.println("ID:="+ emp2.getEmpId());
	   System.out.println("Name:="+ emp2.getEmpName());
	   System.out.println("Salary:="+ emp2.getEmpSalary());
	   System.out.println("Phone No:="+ emp2.getEmpPhone());
	   System.out.println("Address:="+ emp2.getEmpAddress());
   }
}
