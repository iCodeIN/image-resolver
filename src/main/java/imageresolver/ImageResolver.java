package imageresolver;

import java.util.Optional;
import java.util.function.Function;

@FunctionalInterface
public interface ImageResolver extends Function<String, Function<UrlToHtml, Optional<String>>> {

    @Override
    Function<UrlToHtml, Optional<String>> apply(final String url);
}