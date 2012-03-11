package com.billybobbain.pitcher;

import org.codegist.crest.annotate.EndPoint;
import org.codegist.crest.annotate.Path;
import org.codegist.crest.annotate.QueryParam;

@EndPoint("http://ajax.googleapis.com")
@Path("ajax/services/search")
@QueryParam(value = "v", defaultValue = "1.0")
public interface SearchService {

    @Path("web")
    String search(@QueryParam("q") String text);

}
