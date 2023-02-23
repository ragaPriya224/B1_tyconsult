Stage1: Connection establishment
  a. Register the Driver
      Class.forName("com.mysql.jdbc.Driver");
  b. Establish a Connection
      Connection conn = DriverManager.getConnection(URL,userid,password);
 --------------------------------------------------------------------------------
Stage 2:Query construction
  a. Create a Statement
    Statement stmt = conn.createStatement();
               OR
    PreparedStatement stmt = conn.prepareStatement(String sql);
 b. Query the Database
 – executeQuery() for QUERY statements
– executeUpdate() for INSERT, UPDATE, DELETE, or DDL
statements
– execute() for either type of statement

ResultSet rset = stmt.executeQuery(statement);
int count = stmt.executeUpdate(statement);
boolean isquery = stmt.execute(statement); 
********************************************************
Statement stmt = conn.createStatement();
ResultSet rset = stmt.executeQuery
("select RENTAL_ID, STATUS from ACME_RENTALS");
**********************************************
Statement stmt = conn.createStatement();
int rowcount = stmt.executeUpdate
("delete from ACME_RENTAL_ITEMS
where rental_id = 1011");
************************************************
 --------------------------------------------------------------------------------
 Stage 3: Process the Results
tage 4:  Close the Connection



------------------------
 public static int insertDb(int fid,String fname,int fprice,int fq,int foodTotal){        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/CMSDB","root","Password123"); 
            PreparedStatement stmt=con.prepareStatement("insert into orderfood values(?,?,?,?,?)");  
        stmt.setInt(1,fid);  
        stmt.setString(2,fname);  
        stmt.setInt(3,fprice);
        stmt.setInt(4,fq);   
        stmt.setInt(5,foodTotal);
        i=stmt.executeUpdate();  
        //System.out.println(i+" records inserted");  
        }catch(Exception e){ System.out.println(e);}  
                return i;
            }  

    public static Menu[] fetchDb(){
        Menu m[]=null;
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/CMSDB","root","Password123");
            Statement stmt=con.createStatement();  
                    
            ResultSet rs=stmt.executeQuery("select * from menu");  
            ArrayList<Menu> list=new ArrayList<Menu>();          
            while(rs.next()) { 
            list.add(new Menu(rs.getInt(1),rs.getString(2),rs.getInt(3)));
                m=new Menu[list.size()];
                m= list.toArray(m);
                  } 
        }catch(Exception e){ System.out.println(e);}  
            
        return m;      
        }
