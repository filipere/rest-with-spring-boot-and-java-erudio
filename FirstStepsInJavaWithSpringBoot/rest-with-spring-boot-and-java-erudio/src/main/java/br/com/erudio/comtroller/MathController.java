package br.com.erudio.comtroller;

import br.com.erudio.Math.SimpleMath;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.validantions.ValidationNumeric;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class MathController {

    private final ValidationNumeric validationNumeric;

    private SimpleMath math;

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception{

        if (!validationNumeric.isNumeric(numberOne) || !validationNumeric.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sum(validationNumeric.convertToDouble(numberOne), validationNumeric.convertToDouble(numberTwo));
    }

    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
                              @PathVariable(value = "numberTwo") String numberTwo) throws Exception{

        if (!validationNumeric.isNumeric(numberOne) || !validationNumeric.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.subtraction(validationNumeric.convertToDouble(numberOne), validationNumeric.convertToDouble(numberTwo));
    }

    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
                                 @PathVariable(value = "numberTwo") String numberTwo) throws Exception{

        if (!validationNumeric.isNumeric(numberOne) || !validationNumeric.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.multiplication(validationNumeric.convertToDouble(numberOne), validationNumeric.convertToDouble(numberTwo));
    }

    @GetMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo) throws Exception{

        if (!validationNumeric.isNumeric(numberOne) || !validationNumeric.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.division(validationNumeric.convertToDouble(numberOne), validationNumeric.convertToDouble(numberTwo));
    }

    @GetMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo) throws Exception{

        if (!validationNumeric.isNumeric(numberOne) || !validationNumeric.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.mean(validationNumeric.convertToDouble(numberOne), validationNumeric.convertToDouble(numberTwo));
    }

    @GetMapping("/squareRoot/{number}")
    public Double squareRoot(@PathVariable(value = "number") String number) throws Exception{

        if (!validationNumeric.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.squareRoot(validationNumeric.convertToDouble(number));
    }

}