package gbs.finance.blockchain.oms.util;

public class PoConstants {

	public PoConstants() {

	}

	public static final String DATE_FORMAT = "yyyyMMddHHmmssSSS";
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int DATE_LENGTH = 17;
	public static final String DATE_FORMAT_TIME_STAMP = "yyyyMMddHHmmssSSSSSS";
	public static final String DATE_FORMAT_KAFKA_STAMP = "yyyy-MM-dd HH:mm:ss";
	public static final String KAFKA_LAST_UPDATE = "kafka_last_update";
	public static final String MESSAGE_JSON = "message_json";
	public static final String DATE_FORMAT_TIME_RDD = "yyy-MM-dd";
	public static final String START_TIME = "startTime";
	public static final String END_TIME = "endTime";
	public static final String PO_NBR = "poNbr";
	public static final String TRUE = "true";;
	public static final String FALSE = "false";
	public static final String PIPE = "|";
	public static final String COMMA = ",";
	public static final String TIMEZONE_CST = "CST";
	public static final String TIMEZONE_UTC = "UTC";
	public static final String PARAMS = "parameters";
	public static final String US_CODE = "US";
	public static final int US_OFFICE_ID = 1;
	public static final int NEW_PO = 1;
	public static final int EDIT_PO = 2;
	public static final String DIV_WALMART = "WMT";
	public static final String DIV_SAMS = "SAMS";
	public static final String DIV_WALMART_ID = "1";
	public static final String DIV_SAMS_ID = "18";
	public static final String EMPTY_STRING = "";
	public static final String MESSAGE_TYPE = "message_type";
	public static final String ITEM_NUMBER = "item_nbr";

	public static final String FORMAT = "UTF-8";
	public static final String SHA_VERSION = "SHA-256";
	public static final String AES_TYPE = "AES";
	public static final String CIPHER = "AES/GCM/NoPadding";
	public static final int KEY_LENGTH = 16;

	public static final String API_ERROR_MSG = "Po line details not found from the zFAM for given date range.";
	public static final String COMMON_ERROR_MSG = "Po line details not found from the zFAM PO CREATE and PO UPDATE for given date range or invalid date range given. "
			+ "Please give valid datetime format (ex:20171020095318000311)";
	public static final String ERROR_MSG = "GetPO - Debug : Error Message : ";
	public static final String SUCCESS_MSG = "Success(Switch is on) : Process completed";
	public static final String NO_ITEM_MESSAGE = "No Records found in the Filter_Item and Filter_Supplier tables";
	public static final String OUTAGE_MESSAGE = "Down Due to Maintainance Outage flag";
	public static final String KAFKA_MESSAGE_NOT_RESTARTED = "KafkaConsumer : no restart required";
	public static final String KAFKA_MESSAGE_RESTARTED = "KafkaConsumer : restarted";

	public static final String PO_CREATE_START_TIME = "poCreateStartTime";
	public static final String PO_UPDATE_START_TIME = "poUpdateStartTime";
	public static final String TS_FILE_NAME = "src/main/resources/timestamp.properties";
	public static final String TS_FILE_PATH = "/app/FoodSafetyzFAM/current/WEB-INF/classes/timestamp.properties";

	public static final String PROCESS_TYPE_CD = "process_type_cd";
	public static final String HOST_NAME = "hostname";
	public static final String PROCESSING = "processing";
	public static final String START_TS = "start_ts";
	public static final String END_TS = "end_ts";
	public static final String LAST_CHG_TS = "last_chg_ts";

	public static final int PROCESS_TYPE_GET_PO = 1;
	public static final String SELECT_NEXT_INTERVAL = "SELECT_NEXT_INTERVAL";
	public static final String UPDATE_NEXT_INTERVAL = "UPDATE_NEXT_INTERVAL";
	public static final String FETCH_INTERVAL = "FETCH_INTERVAL";
	public static final String FINISH_CURRENT_INTERVAL = "FINISH_CURRENT_INTERVAL";

	public static final int RETRY_COUNT_ONE = 1;
	public static final int MAX_RETRY_ATTEMPT = 6;
	public static final int HTTP_INTERNAL_SERVER_ERROR = 500;
	public static final int HTTP_PAGE_NOT_FOUND = 404;
	public static final int HTTP_SERVER_NOTAVAILABLE = 503;
	public static final int LAST_ATTEMPT_COUNT = 5;
	public static final int RETRY_COUNT_TWO = 2;
	public static final int RETRY_COUNT_THREE = 3;
	public static final String JSON_TYPE = "json";
	public static final String PUBLISH_FAILED = "Publish Message Failed";

	public static final int PROCESS_SLEEP = 1000;
	public static final int KAFKA_SLEEP = 3000;
	public static final int KAFKA_RESTART_CHECK = 30;
	public static final int RECONNECT_BACKOFF_KAFKA = 1000;
	public static final String PROCESS_DEFAULT = "Not Started";
	public static final String PROCESS_IN_PROGRESS = "In Progress";
	public static final String PROCESS_COMPLETE = "Complete";

	public static final int STATUS_OK = 200;
	public static final int STATUS_OK_PARTIAL = 206;
	public static final int STATUS_UN_AUTHORIZED = 401;
	public static final int STATUS_BAD_REQUEST = 400;
	public static final int STATUS_INTERNAL_SERVER_ERROR = 500;
	public static final int STATUS_FORBIDDEN = 403;

	public static final String UN_AUTHORIZED_MSG = "User Authentication failed";
	public static final String BAD_REQUEST_MSG = "Bad Request occured";
	public static final String INTERNAL_SERVER_ERROR_MSG = "Illegal Argument Exception occured";

	public static final int FIRST_STRING_INDEX = 0;

	public static final String OMS_TIMESTAMP_ZEROES = "00000000000000000000000000000000";
	public static final String OMS_HEADER_ZFAM_LASTKEY = "zfam-lastkey";

	public static final int OMS_CALL_SLEEP = 30000;

	public static final int OMS_MAX_ROW_LIMIT = 9999;

	public static final String PROCESS_SUCCESS = "Process Completed";
	public static final String PROCESS_FAIL = "Process Failed";
	public static final String PUBLISH_SUCCESS_MSG = "Published the message successfully";
	public static final String SPLIT = "#";
	public static final String PO_ERROR_MSGS = "GetPO – Error : ";
	public static final String FAIL_MSG = "JMSException";
	public static final String ERROR_MSG_PUBLISH = "Published the message successfully into the PO ERROR MQ";
	public static final String COMMON_LOG_MSG = "GetPO - Warn : Complete : Message from CloudService : ";
	public static final String COMMON_LOG_MSG_COUNT = " and Count value : ";
	public static final String KAFKA_CONSUMER_ID = "poKafkaConsumer";

}
