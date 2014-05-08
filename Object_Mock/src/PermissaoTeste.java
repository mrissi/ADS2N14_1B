import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class PermissaoTeste {

	
	@Test
	public void test() {
		User userJoe = mock(User.class);
		Sistema portal = mock(Sistema.class);
		Sistema intranet = mock(Sistema.class);
		
		Permission permission = new Permission();
		assertTrue(permission.conAccess(userJoe, portal));
		assertFalse(permission.conAccess(userJoe, intranet));
	}

}
