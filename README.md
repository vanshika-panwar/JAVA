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






