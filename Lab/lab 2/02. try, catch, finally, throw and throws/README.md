## Exception Handeling 
An exception is an “unwanted or unexpected event”, which occurs during the execution of the program.
These exceptions can be :  
a. **Checked** -> Checked during compile time, must be handled imidiately.  
b. **Unchecked** -> Checked During runtime.

### Blocks & Keywords used for exception handling:
1. try 
2. catch
3. throw
4. throws
5. finally  

---

**Try:** The try block contains set of statements where an exception can occur.Try is followed by catch or finally.    

**Catch:** Catch block is used to handle the uncertain condition of try block. A try block is always followed by a catch block, which handles the exception that occurs in associated try block.   

**Throw:**  Throw keyword is used to transfer control from try block to catch block.  

**Throws:**   Throws keyword is used for exception handling without try & catch block. It specifies the exceptions that a method can throw to the caller and does not handle itself.  

**Finally:**   It is executed after catch block. We basically use it to put some common code when there are multiple catch blocks. It can also remain independent (only block after try),and is always executed.