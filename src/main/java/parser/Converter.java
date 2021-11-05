package parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.IncomeMessage;

public class Converter {
    public IncomeMessage MessageParser(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IncomeMessage message = mapper.readValue(json, IncomeMessage.class);
        return message;
    }
}
