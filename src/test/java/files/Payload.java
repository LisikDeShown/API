package files;

public class Payload {
    public static String addPlace(){
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}\n";
    }

    public static String updatePlace(String placeId){
        return "{\n" +
                "\"place_id\":\""+placeId+"\",\n" +
                "\"address\":\"70 winter walk, USA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}";
    }

    public static String deletePLace(String placeId){
        return "{\"place_id\":\""+placeId+"\"}";
    }

    public static String coursePrice(){
        return "{\n" +
                "\n" +
                "\"dashboard\": {\n" +
                "\n" +
                "\"purchaseAmount\": 910,\n" +
                "\n" +
                "\"website\": \"rahulshettyacademy.com\"\n" +
                "\n" +
                "},\n" +
                "\n" +
                "\"courses\": [\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"Selenium Python\",\n" +
                "\n" +
                "\"price\": 50,\n" +
                "\n" +
                "\"copies\": 6\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"Cypress\",\n" +
                "\n" +
                "\"price\": 40,\n" +
                "\n" +
                "\"copies\": 4\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"RPA\",\n" +
                "\n" +
                "\"price\": 45,\n" +
                "\n" +
                "\"copies\": 10\n" +
                "\n" +
                "}\n" +
                "\n" +
                "]\n" +
                "\n" +
                "}";
    }

    public static String test1(){
        return "{\n" +
                "    \"@graph\": {\n" +
                "        \"@id\": \"hmevent:AuthenticateEvent\",\n" +
                "        \"authMethod\": \"IP\",\n" +
                "        \"authStatus\": \"REG_IP\",\n" +
                "        \"departmentId\": \"D4498\",\n" +
                "        \"departmentName\": \"UPenn Radiology\",\n" +
                "        \"hmEventMetadata\": {\n" +
                "            \"accessMethod\": \"online\",\n" +
                "            \"accessMethodType\": \"mobile app\",\n" +
                "            \"accessVersion\": \"1.1\",\n" +
                "            \"accountId\": \"C00017456891\",\n" +
                "            \"accountName\": \"University of Pennsylvania\",\n" +
                "            \"consortiumId\": \"S0001123\",\n" +
                "            \"consortiumName\": \"UPenn Medical Center\",\n" +
                "            \"deviceId\": \"Android phone\",\n" +
                "            \"deviceType\": \"Mobile\",\n" +
                "            \"eventCreatedTime\": \"2021-01-24T10:00:01Z\",\n" +
                "            \"eventLocation\": \"Some URI\",\n" +
                "            \"metadataVersion\": \"1.0.5\",\n" +
                "            \"operatingSystem\": \"Windows\",\n" +
                "            \"productEnvironment\": \"QA\",\n" +
                "            \"productId\": \"CK\",\n" +
                "            \"productLineId\": \"Search\",\n" +
                "            \"productLineName\": \"ClinicalKey\",\n" +
                "            \"productName\": \"test\",\n" +
                "            \"productVersion\": \"v5.3.3\",\n" +
                "            \"provenance\": {\n" +
                "                \"createdBy\": \"CKData V4\",\n" +
                "                \"createdOn\": \"1970-01-01T00:00:00.000Z\",\n" +
                "                \"derivedFrom\": \"12345\"\n" +
                "            },\n" +
                "            \"referrerName\": \"Google\",\n" +
                "            \"referrerUrl\": \"www.google.com\",\n" +
                "            \"referrerIpAddress\": \"216.3.128.12\",\n" +
                "            \"sessionId\": \"test0082\",\n" +
                "            \"subAccountId\": \"D00017456891\",\n" +
                "            \"subAccountName\": \"CVS\",\n" +
                "            \"userId\": \"111456749\",\n" +
                "            \"userRole\": \"Physician\",\n" +
                "            \"@type\": \"hmevent:HmEventMetadata\",\n" +
                "            \"eventType\": \"AUTHENTICATE\",\n" +
                "            \"eventVersion\": \"1.0.3\"\n" +
                "        },\n" +
                "        \"ipAddress\": \"123.45.67.89\",\n" +
                "        \"@type\": [\n" +
                "            \"hmevent:Authenticate\",\n" +
                "            \"hmevent:SparksEvent\"\n" +
                "        ]\n" +
                "    },\n" +
                "    \"@context\": {\n" +
                "        \"hmEventMetadata\": {\n" +
                "            \"@id\": \"hmevent:HmEventMetadata\"\n" +
                "        },\n" +
                "        \"hmevent\": \"http://hmevent.org/ns#\",\n" +
                "        \"schema\": \"http://schema.org/\",\n" +
                "        \"rdf\": \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\",\n" +
                "        \"xsd\": \"http://www.w3.org/2001/XMLSchema#\",\n" +
                "        \"pav\": \"http://purl.org/pav/\",\n" +
                "        \"prov\": \"http://www.w3.org/ns/prov#\",\n" +
                "        \"accessMethod\": {\n" +
                "            \"@id\": \"hmevent:accessMethod\"\n" +
                "        },\n" +
                "        \"accessMethodType\": {\n" +
                "            \"@id\": \"hmevent:accessMethodType\"\n" +
                "        },\n" +
                "        \"accessVersion\": {\n" +
                "            \"@id\": \"hmevent:accessVersion\"\n" +
                "        },\n" +
                "        \"accountId\": {\n" +
                "            \"@id\": \"hmevent:accountId\"\n" +
                "        },\n" +
                "        \"accountName\": {\n" +
                "            \"@id\": \"hmevent:accountName\"\n" +
                "        },\n" +
                "        \"consortiumId\": {\n" +
                "            \"@id\": \"hmevent:consortiumId\"\n" +
                "        },\n" +
                "        \"consortiumName\": {\n" +
                "            \"@id\": \"hmevent:consortiumName\"\n" +
                "        },\n" +
                "        \"createdBy\": {\n" +
                "            \"@id\": \"pav:createdBy\"\n" +
                "        },\n" +
                "        \"createdOn\": {\n" +
                "            \"@id\": \"pav:createdOn\"\n" +
                "        },\n" +
                "        \"derivedFrom\": {\n" +
                "            \"@id\": \"pav:derivedFrom\"\n" +
                "        },\n" +
                "        \"deviceId\": {\n" +
                "            \"@id\": \"hmevent:deviceId\"\n" +
                "        },\n" +
                "        \"deviceType\": {\n" +
                "            \"@id\": \"hmevent:deviceType\"\n" +
                "        },\n" +
                "        \"eventCreatedTime\": {\n" +
                "            \"@type\": \"xsd:dateTime\",\n" +
                "            \"@id\": \"hmevent:eventCreatedTime\"\n" +
                "        },\n" +
                "        \"eventLocation\": {\n" +
                "            \"@id\": \"hmevent:eventLocation\"\n" +
                "        },\n" +
                "        \"eventReceivedTime\": {\n" +
                "            \"@type\": \"xsd:dateTime\",\n" +
                "            \"@id\": \"hmevent:eventReceivedTime\"\n" +
                "        },\n" +
                "        \"eventType\": {\n" +
                "            \"@id\": \"hmevent:eventType\"\n" +
                "        },\n" +
                "        \"eventVersion\": {\n" +
                "            \"@id\": \"hmevent:eventVersion\"\n" +
                "        },\n" +
                "        \"metadataVersion\": {\n" +
                "            \"@id\": \"hmevent:metadataVersion\"\n" +
                "        },\n" +
                "        \"operatingSystem\": {\n" +
                "            \"@id\": \"hmevent:operatingSystem\"\n" +
                "        },\n" +
                "        \"productEnvironment\": {\n" +
                "            \"@id\": \"hmevent:productEnvironment\"\n" +
                "        },\n" +
                "        \"productId\": {\n" +
                "            \"@id\": \"hmevent:productId\"\n" +
                "        },\n" +
                "        \"productLineId\": {\n" +
                "            \"@id\": \"hmevent:productLineId\"\n" +
                "        },\n" +
                "        \"productLineName\": {\n" +
                "            \"@id\": \"hmevent:productLineName\"\n" +
                "        },\n" +
                "        \"productName\": {\n" +
                "            \"@id\": \"hmevent:productName\"\n" +
                "        },\n" +
                "        \"productVersion\": {\n" +
                "            \"@id\": \"hmevent:productVersion\"\n" +
                "        },\n" +
                "        \"provenance\": {\n" +
                "            \"@id\": \"prov:Bundle\"\n" +
                "        },\n" +
                "        \"referrerName\": {\n" +
                "            \"@id\": \"hmevent:referrerName\"\n" +
                "        },\n" +
                "        \"referrerUrl\": {\n" +
                "            \"@id\": \"hmevent:referrerUrl\"\n" +
                "        },\n" +
                "        \"referrerIpAddress\": {\n" +
                "            \"@id\": \"hmevent:referrerIpAddress\"\n" +
                "        },\n" +
                "        \"sessionId\": {\n" +
                "            \"@id\": \"hmevent:sessionId\"\n" +
                "        },\n" +
                "        \"subAccountId\": {\n" +
                "            \"@id\": \"hmevent:subAccountId\"\n" +
                "        },\n" +
                "        \"subAccountName\": {\n" +
                "            \"@id\": \"hmevent:subAccountName\"\n" +
                "        },\n" +
                "        \"userId\": {\n" +
                "            \"@id\": \"hmevent:userId\"\n" +
                "        },\n" +
                "        \"userRole\": {\n" +
                "            \"@id\": \"hmevent:userRole\"\n" +
                "        },\n" +
                "        \"authMethod\": {\n" +
                "            \"@id\": \"hmevent:authMethod\"\n" +
                "        },\n" +
                "        \"authStatus\": {\n" +
                "            \"@id\": \"hmevent:authStatus\"\n" +
                "        },\n" +
                "        \"departmentId\": {\n" +
                "            \"@id\": \"hmevent:departmentId\"\n" +
                "        },\n" +
                "        \"departmentName\": {\n" +
                "            \"@id\": \"hmevent:departmentName\"\n" +
                "        },\n" +
                "        \"ipAddress\": {\n" +
                "            \"@id\": \"hmevent:ipAddress\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

    public static String test2(){
        return "{\n" +
                "    \"@graph\": [\n" +
                "        {\n" +
                "            \"@id\": \"hmevent:AuthenticateEvent\",\n" +
                "            \"accountName\": \"University of Pennsylvania\",\n" +
                "            \"authMethod\": \"IP\",\n" +
                "            \"authStatus\": \"REG_IP\",\n" +
                "            \"consortiumId\": \"S0001123\",\n" +
                "            \"consortiumName\": \"UPenn Medical Center\",\n" +
                "            \"departmentId\": \"D4498\",\n" +
                "            \"departmentName\": \"UPenn Radiology\",\n" +
                "            \"hmEventMetadata\": \"hmevent:HmEventMetadata\",\n" +
                "            \"ipAddress\": \"123.45.67.89\",\n" +
                "            \"@type\": [\n" +
                "                \"hmevent:Authenticate\",\n" +
                "                \"hmevent:SparksEvent\",\n" +
                "                \"01def36a-ccf5-480a-9957-89c05bc54fdb\"\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"@id\": \"hmevent:HmEventMetadata\",\n" +
                "            \"accessMethod\": \"app\",\n" +
                "            \"accessMethodType\": \"mobile app\",\n" +
                "            \"accessVersion\": \"1.1\",\n" +
                "            \"accountId\": \"C00017456891\",\n" +
                "            \"accountName\": \"University of Pennsylvania\",\n" +
                "            \"consortiumId\": \"S0001123\",\n" +
                "            \"consortiumName\": \"UPenn Medical Center\",\n" +
                "            \"deviceId\": \"Android phone\",\n" +
                "            \"eventCreatedTime\": \"2021-01-13T19:30:44.941936300Z\",\n" +
                "            \"eventLocation\": \"Some URI\",\n" +
                "            \"metadataVersion\": \"1.0.3\",\n" +
                "            \"productEnvironment\": \"QA\",\n" +
                "            \"productId\": \"STATDX\",\n" +
                "            \"productLineId\": \"Search\",\n" +
                "            \"productLineName\": \"ClinicalKey\",\n" +
                "            \"productName\": \"statdx\",\n" +
                "            \"productVersion\": \"v5.3.3\",\n" +
                "            \"sessionId\": \"0945c61\",\n" +
                "            \"userId\": \"111456749\",\n" +
                "            \"@type\": [\n" +
                "                \"hmevent:HmEventMetadata\",\n" +
                "                \"01def36a-ccf5-480a-9957-89c05bc54fdb\"\n" +
                "            ],\n" +
                "            \"eventType\": \"AUTHENTICATE\",\n" +
                "            \"eventVersion\": \"1.0.1\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"@context\": {\n" +
                "        \"hmEventMetadata\": {\n" +
                "            \"@type\": \"@id\",\n" +
                "            \"@id\": \"hmevent:HmEventMetadata\"\n" +
                "        },\n" +
                "        \"hmevent\": \"http://hmevent.org/ns#\",\n" +
                "        \"schema\": \"http://schema.org/\",\n" +
                "        \"rdf\": \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\",\n" +
                "        \"xsd\": \"http://www.w3.org/2001/XMLSchema#\",\n" +
                "        \"accessMethod\": {\n" +
                "            \"@id\": \"hmevent:accessMethod\"\n" +
                "        },\n" +
                "        \"accessMethodType\": {\n" +
                "            \"@id\": \"hmevent:accessMethodType\"\n" +
                "        },\n" +
                "        \"accessVersion\": {\n" +
                "            \"@id\": \"hmevent:accessVersion\"\n" +
                "        },\n" +
                "        \"accountId\": {\n" +
                "            \"@id\": \"hmevent:accountId\"\n" +
                "        },\n" +
                "        \"accountName\": {\n" +
                "            \"@id\": \"hmevent:accountName\"\n" +
                "        },\n" +
                "        \"consortiumId\": {\n" +
                "            \"@id\": \"hmevent:consortiumId\"\n" +
                "        },\n" +
                "        \"consortiumName\": {\n" +
                "            \"@id\": \"hmevent:consortiumName\"\n" +
                "        },\n" +
                "        \"deviceId\": {\n" +
                "            \"@id\": \"hmevent:deviceId\"\n" +
                "        },\n" +
                "        \"eventCreatedTime\": {\n" +
                "            \"@type\": \"xsd:dateTime\",\n" +
                "            \"@id\": \"hmevent:eventCreatedTime\"\n" +
                "        },\n" +
                "        \"eventLocation\": {\n" +
                "            \"@id\": \"hmevent:eventLocation\"\n" +
                "        },\n" +
                "        \"eventReceivedTime\": {\n" +
                "            \"@type\": \"xsd:dateTime\",\n" +
                "            \"@id\": \"hmevent:eventReceivedTime\"\n" +
                "        },\n" +
                "        \"eventType\": {\n" +
                "            \"@id\": \"hmevent:eventType\"\n" +
                "        },\n" +
                "        \"eventVersion\": {\n" +
                "            \"@id\": \"hmevent:eventVersion\"\n" +
                "        },\n" +
                "        \"metadataVersion\": {\n" +
                "            \"@id\": \"hmevent:metadataVersion\"\n" +
                "        },\n" +
                "        \"productEnvironment\": {\n" +
                "            \"@id\": \"hmevent:productEnvironment\"\n" +
                "        },\n" +
                "        \"productId\": {\n" +
                "            \"@id\": \"hmevent:productId\"\n" +
                "        },\n" +
                "        \"productLineId\": {\n" +
                "            \"@id\": \"hmevent:productLineId\"\n" +
                "        },\n" +
                "        \"productLineName\": {\n" +
                "            \"@id\": \"hmevent:productLineName\"\n" +
                "        },\n" +
                "        \"productName\": {\n" +
                "            \"@id\": \"hmevent:productName\"\n" +
                "        },\n" +
                "        \"productVersion\": {\n" +
                "            \"@id\": \"hmevent:productVersion\"\n" +
                "        },\n" +
                "        \"sessionId\": {\n" +
                "            \"@id\": \"hmevent:sessionId\"\n" +
                "        },\n" +
                "        \"userId\": {\n" +
                "            \"@id\": \"hmevent:userId\"\n" +
                "        },\n" +
                "        \"authMethod\": {\n" +
                "            \"@id\": \"hmevent:authMethod\"\n" +
                "        },\n" +
                "        \"authStatus\": {\n" +
                "            \"@id\": \"hmevent:authStatus\"\n" +
                "        },\n" +
                "        \"departmentId\": {\n" +
                "            \"@id\": \"hmevent:departmentId\"\n" +
                "        },\n" +
                "        \"departmentName\": {\n" +
                "            \"@id\": \"hmevent:departmentName\"\n" +
                "        },\n" +
                "        \"ipAddress\": {\n" +
                "            \"@id\": \"hmevent:ipAddress\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }
}
