#include <stdio.h>
#include <arpa/inet.h>
#include <sys/socket.h>

#define PORT 9534

int main()
{
	int client_socket;
	
	struct sockaddr_in client_address;

	client_socket = socket(AF_INET, SOCK_STREAM, 0);
	
	client_address.sin_family = AF_INET;
	cline_address.sin_addr.s_addr		
}
