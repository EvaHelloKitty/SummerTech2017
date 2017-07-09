import st.Prompt;


public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] a = new String [5];
		
		double [] b = new double [5];
		
		String c = "";
		
		double d = 0;
		
		int e=0;
		
		while (!c.equals("end")){
			c=Prompt.getString("Add a student name!");
			if (!c.equals("end")){
				a[e]=c;
				d= Prompt.getDouble("Great! Now add the student's average.");
				b[e]=d;
				e++;
			}
		}
		for (int x=0;x<=e-1;x++){
			System.out.println(a[x]+" "+b[x]);
		}

	}
}
