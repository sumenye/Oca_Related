package ExceptionsReview;

public class notes {

	public static void main(String[] args) {
		
		
		
		/*		
		
		1. final Keyword:  if any feature has final keyword,  its value cannot be changed.
			 	final keyword is only applicable to: methods, variables, and classes
			 	
			 		1. variable: if variable is final (local, or instance or class) it cannot be re-assigned
			 						final variables MUST be initialized before use.
			 						
			 						instance and class variables MUST be initialized immediately:
			 									instance variable can be initialized either in constructor or instance block
			 									class variable can be initialized in the static block
			 									
			 		2. methods: if methods are final, methods cannot be override
			 				( abstract methods cannot be final, beacsue it's meant to be override)
			 		
			 		3. class: if class is final, the class cannot have a sub class ( cannot be extended )
							(abstract class cannot be final, because abstract class is meant to be extended)
							(interface also cannot be final, because interface is meant to be implemnted)
		
		2. Constructor: special method. belongs to the object.
			 
				 1. Every class MUST have constructor. 
				 		(if there isn't any, compiler will give no-arg constructor by default)
				 
				 2. Constructor method cannot have return-types or specifiers
				 			return-types: primitives, wrapper class, objects,...
				 			specifiers: final, static, abstract
				 			
				 3. Constructor' name MUST be same with the ClassName
				 
				 4. constructor' execution depends on the creation of the object
				 
				 5. constructor can only be called in other constructor. 
				 				( methods or blocks cannot call constructor)
				 
				 6. constructor cannot be called by constructor-name, MUST be called with this or super keyword
				 				this(): calls the class' constructor
				 				super(): calls the super class' constructor
				 				
				 7. constructor cannot call or contain itself
				 
				 8. A constructor cannot call more than one constructor
				 
				 9. constructor' body constructor call needs to be at first step
				 
				 10. class' object MUST be created with existing and visible constructor(s)
				 
				 11. super class' no-arg constructor is called in sub class' constructorS by default
				 
				 12. super class' constructor ( if there isn't deafult constructor) MUST be called in sub class
				  		(if there is more than one constructor in super class, only one of them needs to be called)			  
			
			
		3. this & super keywords: refer to the object instances
		
			  1. this: refers to the object instance in the class
			  
			 		this. : calls the instance methods, instance variables. 
			 				 can be used in instance block, constructor and instance methods
			 				 
			 		this(): calls the class' constructor. can only be used in class' constructor
			 	
			 	
			 2. super: refers to the object instance in super class
			 
			 		super. : calls the instance methods, instance variables.
			 		 		can be used in subclass' instance block,  subclass' constructor and subclass' instance methods
			 		
			 		super(): calls super class' constructor. can only be used in sub class' constructor
		
		
		
		
		4. Override method: only instance methods can be override ( cannot have final or private access modifier)
			 		1. has to be override in the sub class.
			 		2. Both parameters and method name MUST be same with the original method.
			 		3. override method' access modifier has to be same or greater (more visible) than the original 
			 		4. @override annotation has to be applicable to the method
			 			
			 		
			 		
			 		
		 5. Override vs overload:
		 		overload method: 
		 				1. parameters MUST be different
		 				2. return type does not have to be same, doesn't matter
		 				3. any methods( instance method, static methods) and constructor can be overload
		 				4. method can be overload in the same class
		 				5. access modifier can be same or different.
		 						 
		 		
		 		override method: 
		 				1. parameters MUST be same.
		 				2. return type has to be same.
		 				3. only instance method can be override. (cannot be final or private)
		 				4. method needs to be override in the sub class
		 				5. access modifier must be same or greater level( more visible) than the original 	 	
		 
			 */	
		
		

		
		
		/*
		 
		OOP: Encapsulation, Inheritance, Abstraction, Polymorphisim
		 
	1. Encapsulation: hides the instance variables ( usually have private access modifiers )
 
			 getter: Read ONLY
			 	1. return method ( Return-Type cannot be void)
			 	2. access modifier Should not be private
			 	3. return Type must be same data-type with the instance variable'
			 	4. does not have any argument
			 	
			 	
			 Setter: Modify
			 	1. none return method ( void)
			 	2. access modifier should not be private
			 	3. must have an argument and argument' data-type MUST be same with instance variable'
			 	4. argument must be initialized to the instance variable
			 		 
		 
	2. inheritance: used to build relationships between classes.
		 		we use extend Keyword to build super and sub relationships between classes
		 		
		 		if have:  class    A     extends   class    B
		 						  sub					   super	  
		 		
			 	1.  sub class can inherit all the inheritable features from the superclass.
			 			features means: blocks, methods and fields.
			 		
			 		feature that are not inheritable from the super class:
		 					1. features that are not visible in sub class. 
		 						( 1. features with private access modifiers, 
		 							2.feature with default Access modifier if sub&super 
		 									class are not in same package )
		 							
		 					2. Constructors
		 					
		 					3. Abstract methods ( if sub class is not abstract )
		 					
		 					
		 		2. super class cannot inherit any features from the sub class.
		 		 			(parent cannot get from the child)
		 			
			 	3. class can only extend one class.
			 	   class can be extended by multiple classes.
			 	
			 	4. super class cannot be final or private.	
			 	
	
3. Abstraction: process of hiding the implementation details
				it's achieved by using abstract class and interface only
		
	1. Abstract method: method without body. 
		     can only be declared in an abstract class or in an interface.
		       
				1. A method that meant to be override
				
				2. only instance methods can be abstract.
					(none static)
				
				3. the abstract method cannot be private or final
				
				4. if the child is regular class, it cannot inherit 
					abstract methods from the parent, therefore child
					 MUST override parent' abstract methods.

				5. if child is abstract class or interface, it can 
					inherit the abstract method form the parent
	
				6. override abstract method'  access modifier has to be 
				same or greater level (more visible) than the abstract 
				method' access modifier

				
				
		
	2. Abstract class: A class that meant to be extended ( meant to be super class)
					
				1. CAN NOT be final.  
					( if a class is final it cannot be extended)
				
				2. abstract class can only be reference type
					( cannot create object from the abstract class)
				 when abstract class is reference type, object needs to be created from regular sub class

					
				3. Abstract class can have all non-abstract and abstract methods and blocks
	
				
	3. Interface: meant to be implemented
				cannot be final
			
			1. variables in interface are static and final by default
			
			2. variables MUST be initialized immidietly
			
			3. Interface cannot have instance methods.
				( there is no object instances in an interface)
				all instance methods will be abstract by default.
			
			4. interface can only have: 					
							static methods
							abstract methods
							default methods
			
			5. class extends class type, interface extends interface  
						( can only extend one)
				
			6. class implements interface or interfaces
			
			7. when class implements interface, class can inherit all members 
				other than static methods
					 	
		


Exception: the parent class of all the checked and unchecked exceptions classes 

there are two kinds of exceptions: 
		1. checked (unwanted): occurs in compile time (will give compile error)
							needs to be handled immediately.									
		
		2. unchecked (unexpected): occurs during run time.
							compiler is unable to detect, only occurs during runtime
							RuntimeException is the parent class of all the unchecked exceptions' classes 							 											


	Exceptions can be handled by using try&catch blocks and throws keyword
			
			1. try& catch blocks: only of the blocks gets executed.
 					 try block: only executed if there is no unchecked exception
 					 catch block: only executed when if there is unchecked exception
 					
					1. one try block can have multiple catch blocks:
					
						if there are more multiple catch blocks, the catch blocks arguments needs
						to be in Ascending order ( from child class to the parent). 
						CAN NOT be in Descending ( from parent to child) order, and cannot be duplicated
						
					
			2. throws: used with the method signature, 
						indicates that method throws an exception.
						if the method with throws signature is being called by another method, 
						then the caller will have to handle the exception.
						
						
			3. throw: used to create instance of an exception.
			 				(creates the object of the exceptions' classes)
			 				Must be declared within the methods or blocks

*/		

	
	
	
	
	
		 
	
	
	
	

		
		
	}

}