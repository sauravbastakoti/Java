
# User Defined Package:

The package that are created by Java programmer or user for there own use are called user defined package.

### Syntax  : package (package-name);

## Rules:
1. Package must be declared on first line of code.
2. To complile these class : javac -d . class-name.java
  (Must follow that structure)

## While Compiling:
If a directory is given as package, that directory is created and class file is saved in it.


## Access 
|  |Within Class|Within Package|By sub-class,outside|Outside package|
|:--:|:-----:|:------:|:-----:|:----:|
|Public|Yes|No|No|No|
|Default|Yes|Yes|No|No|
|Protected|Yes|Yes|Yes|No|
|Public|Yes|Yes|Yes|Yes|