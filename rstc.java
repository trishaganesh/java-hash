/ reflexive property
 assertTrue( a.equals(a) );
 
 // symmetric property
 assertTrue( a.equals(c) == c.equals(a) );
 
 // transitive property
 if ( a.equals(c) && c.equals(b) ) {
   assertTrue( a.equals(b) );
 }
 
 // consistency property
 assertTrue( a.equals(c) == a.equals(c) );
 
 // non-null property
 assertFalse( a.equals(null) );
