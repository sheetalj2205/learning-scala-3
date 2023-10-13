object Types extends App {

  /*
  DataType	Default value	     Description
  Boolean	   False	          True or False
  Byte	       0	            8 bit signed value. Range:-128 to 127
  Short	       0	            16 bit signed value. Range:-215 to 215-1
  Char	     ‘\u000’	        16 bit unsigned unicode character. Range:0 to 216-1
  Int	         0	            32 bit signed value. Range:-231 to 231-1
  Long	       0L	            64 bit signed value. Range:-263 to 263-1
  Float	       0.0F	          32 bit IEEE 754 single-Precision float
  Double	     0.0D	          64 bit IEEE 754 double-Precision float
  String	     null	          A sequence of character
  Unit	       –	            Coinsides to no value.
  Nothing	     –	            It is a subtype of every other type and it contains no value.
  Any	         –              It is a supertype of all other types
  AnyVal       –	            It serve as value types.
  AnyRef	     –	            It serves as reference types.
  */

  //without type specifying
  val name = "sheetal"
  println(name)

  //with type specified
  val num : Int = 2
  println(num)

}
