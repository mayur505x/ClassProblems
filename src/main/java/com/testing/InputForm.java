package com.testing;

public class InputForm {
    public static void main(String[] args) {
        InputForm inputForm = new InputForm();
        try {
            inputForm.findInput("");
        } catch (InputNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void findInput(String input) throws InputNotFoundException {
        if ("".equals(input)) {
            throw new InputNotFoundException("Input is empty!");
        }
    }
}
