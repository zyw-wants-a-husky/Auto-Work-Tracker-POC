### Auto-Work-Tracker-POC
The project is about an online automotive repair shop management solutions and it's a migration from a monolithic architecture to microservices architechture. This application provides the functionalities like customer live chatting, digital vehicle inspections, make online reservation, and real time shop workflow notification, etc. 

For technical details, we configured spring security with Oauth 2 and JWT for security purpose. We granted different level resources for differnct roles. Also, We use Spring data JPA to handle the communication with database, which is MySQL in this case, by performing CRUD operations. To manage the microservices, we implemented Netflix OSS with Spring Cloud, such as Zuul as a API Gateway, Eureka to discover and register each of the microservicecs, and Ribbon for load balancing. For falut tolerance, we also have Hystrix as circuit breaker. Additionally, We utilized web socket for customer live chatting and apache kafka for sending the notification to the customer as well as handling the real-time data streaming.


#### File Description
- AWTPocApplication.java: main driver to run the whole application
- XXXXConfig.java: Configuration files
- XXXXController: Controller files, main business logic for each module.
- XXXXDao: Data model for each decomposited object
- XXXXRepository: Fetching corresponding data from databse.
