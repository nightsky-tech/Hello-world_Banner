Yes — you should include UC1 as well 
Your README should show both UC1 and UC2 so it looks complete and well-structured for evaluation.

Add UC1 section to README
UC1: Display Hello World
Description

This use case implements a basic Java application that prints a simple “Hello World” message to the console. It serves as the foundational step to verify the project setup and execution using Maven.

Features

Simple console output

No input required

Verifies Java + Maven setup

Execution
mvn exec:java -Dexec.mainClass=HelloApp
Output
Hello World

UC2: Display Hello with Command-Line Argument

This use case extends the basic Hello World program by introducing support for command-line arguments. The application reads user input at runtime and displays a personalised greeting.

Features

Accepts a name as a command-line argument

Displays a customised message when input is provided

Falls back to a default message when no input is given

Execution

Run the application using:

mvn exec:java -Dexec.mainClass=HelloApp -Dexec.args="John"
Output

With argument:

Hello, John!

Without argument:

Hello, John!


UC3: Display Hello with Default Name
Description

This use case improves the application by handling cases where no command-line argument is provided. If a name is given, it displays a personalised greeting; otherwise, it defaults to "World".

Features

Handles missing input safely

Uses default value "World"

Prevents runtime errors

Improves user experience

Execution
mvn exec:java -Dexec.mainClass=HelloApp

With argument:

mvn exec:java -Dexec.mainClass=HelloApp -Dexec.args="John"
Output

With argument:

Hello, John!

Without argument:

Hello, World!

UC4: Display Hello with Multiple Names
Description

This use case extends the application to accept multiple command-line arguments. The program greets each user individually. If no names are provided, it defaults to "World".

Features

Accepts multiple names as input

Uses loop to process all inputs

Displays greeting for each name

Defaults to "World" when no input is given

Execution
mvn exec:java -Dexec.mainClass=HelloApp -Dexec.args="John Alice Bob"
Output

With arguments:

Hello, John!
Hello, Alice!
Hello, Bob!

Without arguments:

Hello, World!



