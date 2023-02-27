# Advance-java
# Java codes
# Web Api
# Advance Java
It is a part of Java programming language. It is an advanced technology or advance version of Java specially designed to develop web-based, network-centric or enterprise applications. It includes the concepts like Servlet, JSP, JDBC, RMI, Socket programming, etc. It is a specialization in specific domain.
# Servlet
Servlet is a technology which is used to create a web application. · Servlet is an API that provides many interfaces and classes including documentation
# Life Cycle of a Servlet (Servlet Life Cycle)
- Servlet class is loaded.
- Servlet instance is created.
- init method is invoked.
- service method is invoked.
- destroy method is invoked.
# Servlet interface
Servlet interface provides commonbehaviorto all the servlets.Servlet interface defines methods that all servlets must implement.
# JSP technology 
JSP technology is used to create web application just like Servlet technology. It can be thought of as an extension to Servlet because it provides more functionality than servlet such as expression language, JSTL, etc.

A JSP page consists of HTML tags and JSP tags. The JSP pages are easier to maintain than Servlet because we can separate designing and development. It provides some additional features such as Expression Language, Custom Tags, etc.
 # What is Hibernate used for?
Hibernate is an open source object relational mapping (ORM) tool that provides a framework to map object-oriented domain models to relational databases for web applications. Object relational mapping is based on the containerization of objects and the abstraction that provides that capacity.
# Why Hibernate is used instead of JDBC?
Unlike JDBC, Hibernate allows developers to write their database-driven Java applications using normal, object-oriented semantics
# What is difference between Spring and Hibernate?
Spring is useful for transaction management, aspect-oriented programming, and dependency injection. Hibernate provides Object-Relational Persistence and Query service for applications. Spring has a number of modules such as Spring core, Spring MVC, Spring Security, Spring JDBC & more.
# Why JPA is better than Hibernate?
So your choices are this: hibernate, toplink, etc... The advantage to JPA is that it allows you to swap out your implementation if need be. The disadvantage is that the native hibernate/toplink/etc... API may offer functionality that the JPA specification doesn't support.
# JavaBean
A JavaBean is a Java class that should follow the following conventions:

- It should have a no-arg constructor.
- It should be Serializable.
- It should provide methods to set and get the values of the properties, known as getter and setter methods.
# Is JavaBean a POJO?
- A JavaBean is a POJO that is serializable, has a no-argument constructor, and allows access to properties using getter and setter methods .
# Spring Boot MVC
- Spring MVC is considered to be the model view controller-based web framework under the Spring framework. 
- A Spring MVC is a Java framework which is used to build web applications. It follows the Model-View-Controller design pattern.
- It implements all the basic features of a core spring framework like Inversion of Control, Dependency Injection.
- Spring's annotation based MVC framework simplifies the process of creating RESTful web services. 
- The key difference between a traditional Spring MVC controller and the RESTful web service controller is the way the HTTP response body is created
 # Introduction of ER Model
- ER Model is used to model the logical view of the system from a data perspective which consists of these components:
# Entity, Entity Type, Entity Set – 

- An Entity may be an object with a physical existence – a particular person, car, house, or employee – or it may be an object with a conceptual existence – a company, a job, or a university course. 

- An Entity is an object of Entity Type and a set of all entities is called as an entity set. e.g.; E1 is an entity having Entity Type Student and set of all students is called Entity Set. In ER diagram, Entity Type is represented as: 
# Attribute(s): 
- Attributes are the properties that define the entity type. For example, Roll_No, Name, DOB, Age, Address, Mobile_No are the attributes that define entity type Student. In ER diagram, the attribute is represented by an oval.

