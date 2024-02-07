package orguivalidation.expense;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

    public static void main(String[] args)
    {
        // Example usage
        String requestBody = "{\"clinicId\": \"efef\"}";

        long startTime = System.currentTimeMillis(); // Record start time

        try {
            validateClinicId(requestBody);
            System.out.println("ClinicId is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            long endTime = System.currentTimeMillis(); // Record end time
            long elapsedTime = endTime - startTime; // Calculate elapsed time
            System.out.println("Validation took " + elapsedTime + " milliseconds.");
        }
    }
    public static void validateClinicId(String requestBody) throws IllegalArgumentException {
        long startTime = System.currentTimeMillis(); // Record start time

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(requestBody);

            JsonNode clinicIdNode = jsonNode.path("clinicId");

            if (clinicIdNode.isTextual()) {
                String clinicIdValue = clinicIdNode.asText();

                // Check if the clinicId is a positive integer
                if (clinicIdValue.matches("\\d+") && Integer.parseInt(clinicIdValue) > 0) {
                    // Valid positive integer clinicId
                } else {
                    throw new IllegalArgumentException("ClinicId is not a valid positive integer.");
                }
            } else {
                throw new IllegalArgumentException("ClinicId is not a valid string.");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error processing request body: " + e.getMessage());
        } finally {
            long endTime = System.currentTimeMillis(); // Record end time
            long elapsedTime = endTime - startTime; // Calculate elapsed time
            System.out.println("Method execution took " + elapsedTime + " milliseconds.");
        }
    }
}
