package com.fjlhome.cpdemo;



public class CalculatorProcessor {

    // 1. Create a private static instance of the class (eager initialization).
    private static final CalculatorProcessor INSTANCE = new CalculatorProcessor();

    // 2. Private member to maintain the running total. It is initialized to 0.
    private Double _runningTotal = 0D;

    private Double _displayNumber = 0D;
    private Double _lastNumber = 0D;

    private String _lastOperation = null;

    // 3. Private constructor to prevent instantiation from other classes.
    private CalculatorProcessor() { }

    // 4. Public static method to provide access to the instance.
    public static CalculatorProcessor getInstance() {
        return INSTANCE;
    }


    public void processOperation(String operation,Double number) {
        switch (operation) {
            case "+":
                _runningTotal += number;
                break;

            case "-":
                _runningTotal -= number;
                break;

            case "*":
                _runningTotal *= number;
                break;

            case "/":
                if (_lastNumber != 0) {
                    _runningTotal /= number;
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                break;
        }
    }

    // 5. Method to accept an operation string and a number, and apply it to the running total.
    public double applyOperation(String operation, Double number) {

        if(number != null && operation == null && _lastOperation == null) {
            _runningTotal = number;
            _displayNumber = _runningTotal;
        }

        if (number ==null){
            if(operation.contains("=") ) {
                processOperation(_lastOperation,_lastNumber);
                _displayNumber = _runningTotal;

            } else if (operation.contains("clear") ) {
                _displayNumber = 0D;
                _runningTotal = 0D;
                _lastNumber = 0D;
                _lastOperation = null;
            }
        }

        // store the operation as the _lastOperation if supplied
        _lastOperation = (operation != null && operation != "=")?operation:_lastOperation;

        // store the number as the _lastNumber if supplied
        _lastNumber = (number != null)?number:_lastNumber;


        // log _runningTotal, _lastNumber, _lastOperation, _displayNumber
        System.out.println("---------: ");
        System.out.println("runningTotal: " + _runningTotal);
        System.out.println("number: " + number);
        System.out.println("lastNumber: " + _lastNumber);
        System.out.println("operation: " + operation);
        System.out.println("lastOperation: " + _lastOperation);
        System.out.println("displayNumber: " + _displayNumber);

        // return the running total
        return _runningTotal;

    }


    public double getRunningTotal() {
        return _runningTotal.doubleValue();
    }
    public double get_lastNumber() {
        return _lastNumber.doubleValue();
    }
    public double getDisplayNumber() {
        return _displayNumber.doubleValue();
    }
}

