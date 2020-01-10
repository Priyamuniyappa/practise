public class ClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StudentDAOIMpl dao=new StudentDAOIMpl();
		StudentDTO st=new StudentDTO();
		st.setRollNo(222);
		st.setName("scott");
		st.setCourse("big data");
		st.setAddress("bang6");
		
		//dao.add(st);//calling add()
		
		StudentDTO st1=new StudentDTO();
		st1.setName("scott mcneily");
		st1.setRollNo(222);
		dao.update(st1);
		//System.out.println("updated");
		
		
		dao.findStudentInfo();
		

	}

}
