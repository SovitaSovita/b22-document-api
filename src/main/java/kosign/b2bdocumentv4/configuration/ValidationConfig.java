package kosign.b2bdocumentv4.configuration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidationConfig {

    public static final String USER_REQUIRED_MESSAGE = "username is required";
    public static final String USER_RESPONSE_MESSAGE = "username must be between 3 and 50 characters";
    public static final int USER_VALIDATION_MIN = 3;
    public static final int USER_VALIDATION_MAX = 50;
    public static final String PASSWORD_REQUIRED_MESSAGE = "password is required";
    public static final String PASSWORD_RESPONSE_MESSAGE = "password must be at least 6 characters";
    public static final String PASSWORD_RESPONSE_REG_MESSAGE = "a valid password must at least 6 characters, and it must include at least one uppercase letter, one lowercase letter,one symbol, and one number";
    public static final String PASSWORD_VALIDATION_REG = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\\-_=+{};:,<.>])(?!.*\\s).{6,}$";
    public static final int PASSWORD_VALIDATION_MIN = 6;
    public static final int PASSWORD_VALIDATION_MAX = 30;
    public static final String EMAIL_REQUIRED_MESSAGE = "email is required";
    public static final String EMAIL_RESPONSE_MESSAGE = "email must be a valid email address";
    public static final String ROLE_REQUIRED_MESSAGE = "roles are required";
    public static final String ROLE_RESPONSE_MESSAGE = "at least one role must be specified";
    public static final int ROLE_VALIDATION_MIN = 1;
    public static final String FIRSTNAME_REQUIRED_MESSAGE = "firstname cannot be empty";
    public static final String FIRSTNAME_RESPONSE_MESSAGE = "firstname cannot exceed 50 characters";
    public static final int FIRSTNAME_VALIDATION_MAX = 50;
    public static final String LASTNAME_REQUIRED_MESSAGE = "lastname cannot be empty";
    public static final String LASTNAME_RESPONSE_MESSAGE = "lastname cannot exceed 50 characters";
    public static final int LASTNAME_VALIDATION_MAX = 50;
    public static final String OTP_RESPONSE_MESSAGE = "otpCode must be at least 6 characters";
    public static final int OTP_VALIDATION_MIN = 6;
    public static final String NOTFOUND_USER = "user not found";
    public static final String EMPTY_USER = "waiting user to registration";
    public static final String WHITE_SPACE = "password cannot be whitespace";
    public static final String USER_INVALID = "email/Username or password is incorrect";
    public static final String REQUIRED_OTP = "sending otpCode is required";
    public static final String INVALID_OTP = "incorrect otpCode";
    public static final String NOT_MATCHES_PASSWORD = "password not matched";
    public static final String EXISTING_EMAIL = "this email is already exist";
    public static final String EXISTING_USERNAME = "this username is already exist";
    public static final String PROFILE_IMAGE_RESPONSE = "profile cannot be empty";
    public static final String ILLEGAL_USER = "this account has not verify yet";
    public static final String INVALID_FILE = "only JPEG, PNG, and TIFF images are allowed";
    public static final String FOUND_DETAIL = "this account is already contain detail information";
    public static final String MIN_MAX_PH = "phone number must be between 9 and 10 characters";
    public static final int MAX_PH = 9;
    public static final int MIN_PH = 8;
    public static final String INVALID_PH = "phone number is invalid";
    public static final String ILLEGAL_FILE = "invalid file extension. Allowed extensions are: .jpg, .jpeg, .png, .tiff";
    public static final String NULL_GENDER = "gender cannot be null";
    public static final String SHOP_NOTFOUND = "shop not found";
    public static final String POST_NOTFOUND = "posted not found";
    public static final String ALREADY_FAV_TO_SHOP = "this shop you have add to favorite list already";
    public static final String EMPTY_FAV_LIST = "your favorite list is empty";
    public static final String SHOP_NOTFOUND_IN_LIST = "shop is not found in your list";
    public static final String EMPTY_SHOP = "shop name cannot be empty";
    public static final String NULL_SHOP = "shop name cannot be null";
    public static final String EMPTY_IMAGE = "image cannot be empty";
    public static final String NULL_IMAGE = "image name cannot be null";
    public static final String EMPTY_ADDRESS = "address cannot be null";
    public static final String NULL_ADDRESS = "address name cannot be null";
    public static final String EMPTY_URL = "url name cannot be null";
    public static final String NULL_URL = "url name cannot be null";
    public static final String ILLEGAL_WHITESPACE = "you cannot input whitespace";
    public static final String SHOP_NOT_CONTAIN = "shop is not containing";
    public static final String USER_CONTAIN_SHOP = "you already set up a shop";
    public static final String ILLEGAL_SHOP_UPDATE = "you are not owner of this shop";
    public static final String NULL_FIELD = "this field cannot be empty";
    public static final String EMPTY_FIELD = "this field cannot be null";
    public static final String INACTIVE_SHOP = "this shop is inactive now";
    public static final String NOT_RATING = "no record of rating shop";
    public static final String FILE_NOTFOUND = "file image is not found in storage";
    public static final String NOTFOUND_USER_INFO = "user information is not found";
    public static final String ILLEGAL_PROCESS = "your role is illegal to process";
    public static final String SHOP_NOT_CREATED = "your shop is not set up yet";
    public static final String ALREADY_FAV_TO_POST = "this post is already added to favorite";
    public static final String POST_NOTFOUND_IN_LIST = "this post is not found in your favorite list";
    public static final String NOT_FOUND_CATEGORIES = "categories are not found";
    public static final String EMPTY_CATEGORIES = "categories are not containing";
    public static final String EXISTING_CATEGORIES = "this category is already exist";
    public static final String NOT_FOUND_SUB_CATEGORIES = "this subcategories is not containing";
    public static final String EXISTING_SUB_CATEGORIES = "this subcategories is already exist";
    public static final String POST_TITLE_MESSAGE = "title must be between 5 and 25 characters";
    public static final String POST_TITLE_REQUIRE = "title is required";
    public static final String POST_DESCRIPTION_MESSAGE = "description mustn't be more than 200 characters ";
    public static final int POST_DESCRIPTION_MAX = 200;
    public static final String NOT_FOUND_MESSAGE = "this message is not found";
    public static final String NOT_FOUND_PRODUCTS = "product in each store is empty";
    public static final String NOT_FOUND_PRODUCT = "product is not found";
    public static final String NOT_FOUND_PRODUCTS_IN_UR_SHOP = "product in this shop is not containing";
    public static final String SUB_CATEGORY_RESPONSE = "subCategory contain at least 1";
    public static final String INVALID_STRING = "This field is invalid";
    public static final String REGEX_ROLES = "\\[|\\]";
    public static final String CANNOT_UPDATE = "you cannot update this product";
    public static final String CANNOT_DELETE = "you cannot delete this product";
    public static final String CANNOT_UPLOAD = "you cannot upload a photo to this product";
    public static final String NOTFOUND_POST = "this post is not found";
    public static final String NOT_EXIST_IN_POST = "this post is not containing comment from seller";
    public static final String NOT_OWNER_PRODUCT = "you are not owner of this product";
    public static final String NOT_OWNER_POST = "you are not owner of this post";
    public static final String NOT_YET_ADD_TO_POST = "you haven't add a product to this post";
    public static final String UR_PRODUCT_NOT_FOUND = "your products is not found in this post";
    public static final String CANNOT_SMALLER = "budget from cannot smaller than Budget To";
    public static final String POST_NOT_CONTAIN = "waiting BUYER to add new post";
    public static final String NOT_FOUND_POST = "post not found";
    public static final String UR_POST_LIST_NOT_CONTAIN = "you post's list is empty";
    public static final String INVALID_RANGE = "this filed cannot be negative";
    public static final String NOT_SET_UP_DETAIL = "you don't have any information to update";
    public static final String INVALID_RANGE_BUDGET_TO = "budget to field cannot be negative";
    public static final String INVALID_RANGE_BUDGET_FROM = "budget from field cannot be negative";
    public static final String INVALID_FIELD = " is invalid";
    public static final String NOT_SUB_CATEGORY = "sub-category not found";
    public static final String NULL_TITLE = "title cannot be null";
    public static final String COUNT_IMAGE = "file cannot exceed 6 images";
    public static final String NULL_FILE = "file cannot be null";
    public static final String EMPTY_FILE = "file cannot be empty";
    public static final String INVALID_PRICE = "price cannot be negative";
    public static final String NULL_DESCRIPTION = "description cannot be null";
    public static final String EMPTY_DESCRIPTION = "description cannot be empty";
    public static final String NULL_BUDGET_FROM = "budget from cannot be null";
    public static final String NULL_BUDGET_TO = "budget to cannot be null";
    public static final String EMPTY_SUB_CATEGORY = "sub-category cannot be empty";
    public static final String NULL_SUB_CATEGORY = "sub-category cannot be null";
    public static final String NULL_STATUS = "status cannot be null";
    public static final String NULL_PRICE = "price cannot be null";
    public static final String NULL_POST_ID = "post id cannot be null";
    public static final String NOT_FOUND_BEST_RATE_SHOP = "top three rated by user is not containing yet";
    public static final String NULL_INPUT = " cannot be null";
    public static final String NOT_FOUND_FILE = "please upload a file";
    public static final String OUT_OF_SCOPE_LEVEL = "level is out of scope (ONE_STAR,TWO_STARS,THREE_STARS,FOUR_STARS,FIVE_STARS)";
    public static final String NOT_FOUND_USER_CONTACT = "your contact list is empty";
    public static final String NOT_YET_TEXTING = "this user haven't chatting with other";
    public static final String INVALID_QUANTITY = "quantity cannot be negative";
    public static final String NULL_QUANTITY = "quantity cannot be null";
    public static final int MIN_SUB_CATEGORY = 1;

}
