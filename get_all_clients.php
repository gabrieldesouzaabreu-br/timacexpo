wing code will list all the clients
 */
<?php 
// array for JSON response
$response = array();
 
// include db connect class
require_once __DIR__ . '/db_connect.php';
 
// connecting to db
$db = new DB_CONNECT();
 
// get all products from products table
$result = mysql_query("SELECT * FROM field_data_contact_name") or die(mysql_error());
 
// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // clients node
    $response["clients"] = array();
 
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $client = array();
        $client["pid"] = $row["entity_id"];
        $client["name"] = $row["contact_name_given"];
 
        // push single client into final response array
        array_push($response["clients"], $client);
    }
    // success
    $response["success"] = 1;
 
    // echoing JSON response
    echo json_encode($response);
} else {
    // no products found
    $response["success"] = 0;
    $response["message"] = "No clients found";
 
    // echo no users JSON
    echo json_encode($response);
}
?>
