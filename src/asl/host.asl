// Agent agent2 in project Restaurant

/* Initial beliefs and rules */

/* Initial goals */


/* Plans */

+findtable(S,X,Y,Free) : S > 0  & X = 4 & Y = 12  <- findtable.
+getTable(F,X,Y) : F <- leadToTable.
+getBack(F,X,Y) : F<-goBack.
