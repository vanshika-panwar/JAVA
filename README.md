# JAVA
Adobe Java Bootcamp


Banuprakash C

Full Stack Architect, 

Co-founder Lucida Technologies Pvt Ltd., 

Corporate Trainer,

Email: banuprakashc@yahoo.co.in

https://www.linkedin.com/in/banu-prakash-50416019/

https://github.com/BanuPrakash/Java

===================================

Softwares Required:
1) Java 8+
	https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html

2) Eclipse for JEE  
	https://www.eclipse.org/downloads/packages/release/2022-06/r/eclipse-ide-enterprise-java-and-web-developers

3) MySQL  [ Prefer on Docker]

Install Docker Desktop

Docker steps:

```
a) docker pull mysql

b) docker run --name local-mysql –p 3306:3306 -e MYSQL_ROOT_PASSWORD=Welcome123 -d mysql

container name given here is "local-mysql"

For Mac:
docker run -p 3306:3306 -d --name local-mysql -e MYSQL_ROOT_PASSWORD=Welcome123 mysql


c) CONNECT TO A MYSQL RUNNING CONTAINER:

$ docker exec -t -i <container_name>  bash

d) Run MySQL client:

bash terminal> mysql -u "root" -p

mysql> exit

```

Day 1

OOP ==>  real-world applications

	Object ==> state and behaviour /actions/ messages

	AC [temp, fan speed; on/off(), increase(), decrease()]
	TV [ channel, volume; on/off(), changeChannel(),,]
	Fan, Computer,...

	Object communicates with other object by sending a message.
	What messages an object can recive is exposed thro its interface.

	Template to build an object / Blue print ==> class, function, Type

	BankingAccount ==> state ==> balance; behaviour ==> credit(); debit();

SOLID design Princples:

S ==> Single Responsibility
O ==> Open Close Principle ==> Closed for Change and Open for extension
L ==> Liskov Substitution Principle
I ==> Interface seggregation
D ==> Dependency Injection ===> Inversion Of Control

===============================================================

Java ==> Technology ==> Platform Provides Apis and Runtime to execute bytecode

Bytecode ==> compiled code ; portable; architecture neutral and platform indepenent

Source Code ==> compile ==> Bytecode ==> can be taken to differenet devices and executed

Mac / Windows machine write source code ==> compile ==> bytecode ==> Settop box/ attendence swipe machine / elevator / Linux machine

source code Java [ JDK ] ==> javac ==> bytecode
Source code Kotlin [ KDK ] ==> Kotlin Compiler ==> bytecode
Source Code Groovy [ Groovy DK] ==> Groovy compiler ==> bytecode


============================================

Account.java

public class Account {
	private double balance;

	public void deposit(double amt) {
		this.balance += amt;
	}

	public double getBalance() {
		return this.balance;
	}
}

javac Account.java ==> Account.class [ Bytecode]


public class AccountTest {
	public static void main(String[] args) {
		Account rahulAcc = new Account();
		Account swethaAcc = new Account();
		rahulAcc.deposit(5000);
		System.out.println(rahulAcc.getBalance());
		swethaAcc.deposit(45000);
	}
}

javac AccountTest.java ==> AccountTest.class [bytecode]

===========

Logically grouping of Objects/classes in enterprise application

1) entity / domain / model class ==> business data ==> data which is long lived, beyond the life of application
	RDBMS/ NoSQL like MongoDB / file system

	Uber ==> Customer; Vehicle; Driver; Trip; Payment
	Swiggy ==> customer; FoodItem; Order; orderItem; Payment

	Generally entity is one per table; columns of database table ==> java fields

	Avoid writing buiness logic in entity class;
	generally entity classes will have fields; constructor; getters/setters; hashCode() and equals()

	Customer.class
	Item.class
	Order.class
	...

2) DAO classes ==> Data Access Object ==> contains CRUD operations to persistent store
	
	class CustomerDao {
		CREATE ==> insert into
		READ ==> select * from
		UPDATE ==> update table
		DELETE ==> delete table
	}

	should not contain UI or business logic code ==> Single Responsibillty

3) Service classes ==> Facade over DAO and business logic
	Normally provide more coarse graind interface to DAO fine-grained operations

	class BankingService {
		// atomic opertion
		void transferFunds(Account fromAcc, Account toAcc, double amt) {
			1) use AccountDAO ==> select balance from fromAcc;
			logic to check sufficient balance exists or not
			2) use AccountDao ==> update fromAcc
			3) use AccountDao ==> update toAcc
			4) use TransactionDAO ==> insert into transACTION table
			5) send SMS
		}
	}	

4) UI classes
	Web / Andrioid / Standalone

5) Utility classes ==> helper classes

6) Exception classes ==> to represent abnormal condition in application

==============

In java we use packages to logically group classes

packages are folders in java

=============================================================

Comments for developers who have access to code
// single line comment

/*
 multi-line comment
 
*/


JavaDoc comments ==> API comments
comments for API users; need not have access to code
/**

*/



ICICIBank application ==> VeriSign ==> APIs boolean verifyPin(pin)

============



AccountClient.java

10th line breakpoint

Debug As ==> Java Application ==> Switch

RightClick ==> AccountClient.main ==> Edit step filters ==> use step filters ==> select all


f5 and f6

once debug is complete

Perspective ==> java

