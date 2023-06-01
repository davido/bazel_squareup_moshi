import com.ryanharter.auto.value.moshi.MoshiAdapterFactory;
import com.squareup.moshi.JsonAdapter;

@MoshiAdapterFactory
abstract class JsonAdapterFactory implements JsonAdapter.Factory {
  static JsonAdapter.Factory create() {
    return new AutoValueMoshi_JsonAdapterFactory();
  }
}
