package com.example.Task;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersControllerTest {

    @Test
    public void multiply() throws JSONException {
        NumbersModel numbers = new NumbersModel(5,3);
        Gson gson = new Gson();
        JSONObject result = new JSONObject();
        result.accumulate("number1", 5);
        result.accumulate("number2", 3);
        result.accumulate("multiplication", 15);
        numbers.setMultiplication();
        assertEquals(result.toString(), gson.toJson(numbers.getNumbers()));
    }
}
