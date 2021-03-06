package explaineverything.wildfly.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonConfig implements ContextResolver<ObjectMapper>
{
   private final ObjectMapper objectMapper = new ObjectMapper();

   public JacksonConfig()
   {
   }

   @Override
   public ObjectMapper getContext(Class<?> objectType)
   {
      return objectMapper;
   }
}