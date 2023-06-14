package Excelreadandwrite;

public class Excel {

	public static void main(String[] args) {
		
		Xls_Reader wr=new Xls_Reader("./src/Exceldata/testdata.xlsx");
		String sn="data";
		
		int count=wr.getRowCount(sn);
		System.out.println(count);
		
		for(int r=2;r<=count;r++)
		{
			String username=wr.getCellData(sn, "Username", r);
			String password=wr.getCellData(sn, "Password", r);
			
			System.out.println(username);
			System.out.println(password);
			
			wr.setCellData(sn, "Status", r, "Dataprinted");
		}
		
		
		

	}

}
