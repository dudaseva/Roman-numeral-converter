
public class ChangeToArab {

    public ChangeToArab() {

    }

    // ne lehessen beirni csak romai szamokat. (jol kell validalni es megoldodik magatol?

    // ismerje fel, hogy arab vagy romai szamot irok be, es vegezze el automatikusan az atvaltast, ismerje fel

    boolean _1 = false;
    boolean _10 = false;
    boolean _100 = false;
    boolean _1000 = false;
    boolean _5 = false;
    boolean _50 = false;
    boolean _500 = false;

    public boolean isValid(String validation) {
        char[] romanNumbers = validation.toCharArray();
        for (int i = 0; i < romanNumbers.length; i++) {

            if (_1 && romanNumbers[i] == 'I') {
                return false;
            } else if (_1 && romanNumbers[i] == 'X') {
                    return false;
            } else if (_1 && romanNumbers[i] == 'L') {
                return false;
            } else if (_1 && romanNumbers[i] == 'C') {
                return false;
            } else if (_1 && romanNumbers[i] == 'D') {
                return false;
            } else if (_1 && romanNumbers[i] == 'M') {
                return false;
            } else if (romanNumbers[i] == 'I') {
                _1 = true;
            }

            else if (_5 && romanNumbers[i] == 'V') {
                return false;
            } else if (_5 && romanNumbers[i] == 'X') {
                return false;
            } else if (_5 && romanNumbers[i] == 'L') {
                return false;
            } else if (_5 && romanNumbers[i] == 'C') {
                return false;
            } else if (_5 && romanNumbers[i] == 'D') {
                return false;
            } else if (_5 && romanNumbers[i] == 'M') {
                return false;
            } else if (romanNumbers[i] == 'V') {
                _5 = true;
            }

            else if (_10 && romanNumbers[i] == 'X') {
                return false;
            } else if (_10 && romanNumbers[i] == 'C') {
                return false;
            } else if (_10 && romanNumbers[i] == 'D') {
                return false;
            } else if (_10 && romanNumbers[i] == 'M') {
                return false;
            } else if (romanNumbers[i] == 'X') {
                _10 = true;
            }


             else if (_50 && romanNumbers[i] == 'L') {
                return false;
            } else if (_50 && romanNumbers[i] == 'C') {
                return false;
            } else if (_50 && romanNumbers[i] == 'D') {
                return false;
            } else if (_50 && romanNumbers[i] == 'M') {
                return false;
            } else if (romanNumbers[i] == 'L') {
                _50 = true;
            }

/// ez nem joo!!!!
            else if (_100 && romanNumbers[i] == 'C') {
                return false;
            } else if (romanNumbers[i] == 'M') {
                    _100 = true;
            } else if (romanNumbers[i] == 'C') {
                _100 = true;
            }


            else if (_500 && romanNumbers[i] == 'D') {
                return false;
            } else if (_500 && romanNumbers[i] == 'M') {
                return false;
            } else if (romanNumbers[i] == 'D') {
                _500 = true;
            }
            else {
            //else if (romanNumbers[i] != 'I' || romanNumbers[i] != 'V' || romanNumbers[i] != 'X' || romanNumbers[i] != 'L' || romanNumbers[i] != 'C' || romanNumbers[i] != 'D' || romanNumbers[i] != 'M') {
                return false;
            }

        }
        return true;
    }





    public int changeBack(String romanNumber) {
        char[] romanNumbers = romanNumber.toCharArray();
        int result = 0;

        for (int i = 0; i < romanNumbers.length; i++) {
            if (romanNumbers[i] == 'M') {
                result += 1000;
            } else if (romanNumbers[i] == 'D') {
                result += 500;
            } else if (romanNumbers[i] == 'C') {
                result += 100;
            } else if (romanNumbers[i] == 'L') {
                result += 50;
            } else if (romanNumbers[i] == 'X') {
                result += 10;
            } else if (romanNumbers[i] == 'V') {
                result += 5;
            } else if (romanNumbers[i] == 'I') {
                result += 1;
            }
        }

        for (int i = 0; i < romanNumbers.length - 1; i++) {
            if (romanNumbers[i] == 'C' && romanNumbers[i + 1] == 'M') {
                result -= 200;
            } else if (romanNumbers[i] == 'C' && romanNumbers[i + 1] == 'D') {
                result -= 200;
            } else if (romanNumbers[i] == 'X' && romanNumbers[i + 1] == 'C') {
                result -= 20;
            } else if (romanNumbers[i] == 'X' && romanNumbers[i + 1] == 'L') {
                result -= 20;
            } else if (romanNumbers[i] == 'I' && romanNumbers[i + 1] == 'X') {
                result -= 2;
            } else if (romanNumbers[i] == 'I' && romanNumbers[i + 1] == 'V') {
                result -= 2;
            }
        }

        return result;
    }
}
