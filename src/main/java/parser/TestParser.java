package parser;

import java.io.File;
import java.util.Objects;

// Adaptador para classe de parser. a Fun��o parseFile deve retornar null caso o parser resulte em erro. 

public class TestParser {
   private ParseAdaptor adp;
   private String okSrcs = "testes/sintaxe/certo";
   private File f;
   
   public TestParser(ParseAdaptor adp, String okSrcs){
	   if(Objects.isNull(okSrcs)) {
		   okSrcs = this.okSrcs;
	   }
		   
        this.adp = adp;
        f = new File(okSrcs);
        runOkTests();
   }
   
   private String filler(int n){
      String s = "";
      for(int i =0; i< n; i++){ s += " "; }
      return s;
   }
   
   public void runOkTests(){
       File inst[];
       int flips, flops;
       flips = 0;
       flops = 0;
       try{
           if( f.isDirectory() ){
               String pth;
               inst = f.listFiles();
               for(File s : inst){
                   pth = s.getPath();
                   System.out.print("Testando " + pth + filler(50 -pth.length()) + "[");
                   if(adp.parseFile(s.getPath()) != null){
                       System.out.println("  OK  ]");
                       flips++;
                   }else{ 
                      System.out.println("FALHOU]");
                      flops++;
                   }
               }
               System.out.println("Total de acertos: " + flips );
               System.out.println("Total de erros: " + flops );
           }else{
              System.out.println("O caminho " + f.getPath() + " n�o � um diret�rio ou n�o existe.");
           }
           
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
  
   

}

