/*
 * @author Maxwell Souza    201435009
 * @author Rodolpho Rossete 201435032
 */
package parser;

import ast.SuperNode;


// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro.

public interface ParseAdaptor{
   public abstract SuperNode parseFile(String path);
   
}



