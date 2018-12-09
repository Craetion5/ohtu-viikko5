package statistics;

import statistics.matcher.All;
import statistics.matcher.Matcher;

public class QueryBuilder {

    public QueryBuilder() {
        
    }

    public Matcher build(Matcher... matchers) {
        
        return new All(matchers);
    }
}
