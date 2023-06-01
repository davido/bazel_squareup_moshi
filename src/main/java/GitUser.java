import com.google.auto.value.AutoValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class GitUser {
  public abstract String name();

  public abstract String mail();

  public static JsonAdapter<GitUser> jsonAdapter(Moshi moshi) {
    return new AutoValue_GitUser.MoshiJsonAdapter(moshi);
  }

  static Builder builder() {
    return new AutoValue_GitUser.Builder();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("GitUser [name()=");
    builder.append(name());
    builder.append(", mail()=");
    builder.append(mail());
    builder.append("]");
    return builder.toString();
  }

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder name(String name);

    abstract Builder mail(String mail);

    abstract GitUser build();
  }
}
