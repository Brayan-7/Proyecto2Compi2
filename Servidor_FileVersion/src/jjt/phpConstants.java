/* Generated By:JJTree&JavaCC: Do not edit this line. phpConstants.java */
package jjt;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface phpConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 7;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 8;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 9;
  /** RegularExpression Id. */
  int NUM = 10;
  /** RegularExpression Id. */
  int ID = 11;
  /** RegularExpression Id. */
  int LETTER = 12;
  /** RegularExpression Id. */
  int CADENA = 13;
  /** RegularExpression Id. */
  int DEC = 14;
  /** RegularExpression Id. */
  int CARAC = 15;
  /** RegularExpression Id. */
  int TAGINICIO = 16;
  /** RegularExpression Id. */
  int TAGFIN = 17;
  /** RegularExpression Id. */
  int PCLASS = 18;
  /** RegularExpression Id. */
  int PVAR = 19;
  /** RegularExpression Id. */
  int PFUNCION = 20;
  /** RegularExpression Id. */
  int PFOR = 21;
  /** RegularExpression Id. */
  int PECHO = 22;
  /** RegularExpression Id. */
  int PRETURN = 23;
  /** RegularExpression Id. */
  int PNEW = 24;
  /** RegularExpression Id. */
  int PCONST = 25;
  /** RegularExpression Id. */
  int PINCL = 26;
  /** RegularExpression Id. */
  int PPARENT = 27;
  /** RegularExpression Id. */
  int PTHIS = 28;
  /** RegularExpression Id. */
  int PEXT = 29;
  /** RegularExpression Id. */
  int PIF = 30;
  /** RegularExpression Id. */
  int PELSE = 31;
  /** RegularExpression Id. */
  int PCASE = 32;
  /** RegularExpression Id. */
  int PSWIT = 33;
  /** RegularExpression Id. */
  int PBREAK = 34;
  /** RegularExpression Id. */
  int PDEFAULT = 35;
  /** RegularExpression Id. */
  int PWHI = 36;
  /** RegularExpression Id. */
  int PDO = 37;
  /** RegularExpression Id. */
  int PCONTI = 38;
  /** RegularExpression Id. */
  int PNULL = 39;
  /** RegularExpression Id. */
  int PTRUE = 40;
  /** RegularExpression Id. */
  int PFALSE = 41;
  /** RegularExpression Id. */
  int LLAVEA = 42;
  /** RegularExpression Id. */
  int LLAVEC = 43;
  /** RegularExpression Id. */
  int IGUAL = 44;
  /** RegularExpression Id. */
  int PUNTOCOMA = 45;
  /** RegularExpression Id. */
  int COMA = 46;
  /** RegularExpression Id. */
  int DOLAR = 47;
  /** RegularExpression Id. */
  int COMILLASIMPLE = 48;
  /** RegularExpression Id. */
  int COMILLADOBLE = 49;
  /** RegularExpression Id. */
  int PARA = 50;
  /** RegularExpression Id. */
  int PARC = 51;
  /** RegularExpression Id. */
  int MAYOR = 52;
  /** RegularExpression Id. */
  int MENOR = 53;
  /** RegularExpression Id. */
  int DECR = 54;
  /** RegularExpression Id. */
  int INC = 55;
  /** RegularExpression Id. */
  int CORCHA = 56;
  /** RegularExpression Id. */
  int CORCHC = 57;
  /** RegularExpression Id. */
  int POR = 58;
  /** RegularExpression Id. */
  int SUMA = 59;
  /** RegularExpression Id. */
  int RESTA = 60;
  /** RegularExpression Id. */
  int DIV = 61;
  /** RegularExpression Id. */
  int MOD = 62;
  /** RegularExpression Id. */
  int POTEN = 63;
  /** RegularExpression Id. */
  int IGUAL2 = 64;
  /** RegularExpression Id. */
  int IDENT = 65;
  /** RegularExpression Id. */
  int DIFE1 = 66;
  /** RegularExpression Id. */
  int DIFE2 = 67;
  /** RegularExpression Id. */
  int NOIDE = 68;
  /** RegularExpression Id. */
  int MENORI = 69;
  /** RegularExpression Id. */
  int MAYORI = 70;
  /** RegularExpression Id. */
  int LAND = 71;
  /** RegularExpression Id. */
  int LOR = 72;
  /** RegularExpression Id. */
  int LXOR = 73;
  /** RegularExpression Id. */
  int LNOT = 74;
  /** RegularExpression Id. */
  int LAND2 = 75;
  /** RegularExpression Id. */
  int LOR2 = 76;
  /** RegularExpression Id. */
  int AMP = 77;
  /** RegularExpression Id. */
  int ASIG = 78;
  /** RegularExpression Id. */
  int PUNTO = 79;
  /** RegularExpression Id. */
  int BARRA = 80;
  /** RegularExpression Id. */
  int SALTO = 81;
  /** RegularExpression Id. */
  int DOBLEP = 82;
  /** RegularExpression Id. */
  int GUIONB = 83;
  /** RegularExpression Id. */
  int DOSP = 84;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_FORMAL_COMMENT = 1;
  /** Lexical state. */
  int IN_MULTI_LINE_COMMENT = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "\"\\t\"",
    "<token of kind 6>",
    "\"*/\"",
    "\"*/\"",
    "<SINGLE_LINE_COMMENT>",
    "<NUM>",
    "<ID>",
    "<LETTER>",
    "<CADENA>",
    "<DEC>",
    "<CARAC>",
    "\"<?php\"",
    "\"?>\"",
    "\"class \"",
    "\"var \"",
    "\"function \"",
    "\"for \"",
    "\"echo \"",
    "\"return \"",
    "\"new \"",
    "\"construct \"",
    "\"include \"",
    "\"parent \"",
    "\"this \"",
    "\"extends \"",
    "\"if \"",
    "\"else \"",
    "\"case \"",
    "\"switch \"",
    "\"break \"",
    "\"default \"",
    "\"while \"",
    "\"do \"",
    "\"continue \"",
    "\"NULL \"",
    "\"true \"",
    "\"false \"",
    "\"{\"",
    "\"}\"",
    "\"=\"",
    "\";\"",
    "\",\"",
    "\"$\"",
    "\"\\\'\"",
    "\"\\\"\"",
    "\"(\"",
    "\")\"",
    "\">\"",
    "\"<\"",
    "\"--\"",
    "\"++\"",
    "\"[\"",
    "\"]\"",
    "\"*\"",
    "\"+\"",
    "\"-\"",
    "\"/\"",
    "\"%\"",
    "\"**\"",
    "\"==\"",
    "\"===\"",
    "\"!=\"",
    "\"<>\"",
    "\"!==\"",
    "\"<=\"",
    "\">=\"",
    "\"and \"",
    "\"or \"",
    "\"xor \"",
    "\"!\"",
    "\"&&\"",
    "\"||\"",
    "\"&\"",
    "\"->\"",
    "\".\"",
    "\"\\\\\"",
    "\"n \"",
    "\"::\"",
    "\"_\"",
    "\":\"",
  };

}
