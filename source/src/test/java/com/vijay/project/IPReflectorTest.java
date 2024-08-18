package com.vijay.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class IPReflectorTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private IPReflector ipReflector;

    @BeforeEach
    void setUp() {
        // Setup code if needed
    }

    @Test
    void testGetPublicIpSuccess() {
        // Arrange
        String expectedIp = "27.5.177.138";
 
        //when(restTemplate.getForObject(Mockito.any(),Mockito.eq(String.class))).thenReturn(expectedIp);
        //when(ipReflector.getPublicIp()).thenReturn(expectedIp);
        // Act
        String result = ipReflector.getPublicIp();

        // Assert
        assertEquals("Your public IP address is: " + expectedIp, result);
        //verify(ipReflector,((IPReflector) times(1)).getPublicIp());
        //assertNotNull(result);
    }

	/*
	 * //@Test void testGetPublicIpFailure() { // Arrange
	 * when(restTemplate.getForObject(anyString(), Mockito.eq(String.class)))
	 * .thenThrow(new
	 * RestClientException("Failed to fetch public IP address. Please try again later."
	 * ));
	 * 
	 * // Act String result = ipReflector.getPublicIp();
	 * 
	 * // Assert
	 * assertEquals("Failed to fetch public IP address. Please try again later.",
	 * result);
	 * 
	 * }
	 */
}
