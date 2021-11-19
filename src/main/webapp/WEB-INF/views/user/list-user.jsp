<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
<meta charset="UTF-8">
<title>List User</title>
</head>
<body>
	<div class="container page__heading-container">
	    <div class="page__heading">
	        <div class="d-flex align-items-center">
	            <div>
	                <nav aria-label="breadcrumb">
	                    <ol class="breadcrumb mb-0">
	                        <li class="breadcrumb-item"><a href="<%= request.getContextPath()%>/home">Home</a></li>
	                        <li class="breadcrumb-item active" aria-current="page">
	                            User
	                        </li>
	                        <li class="breadcrumb-item active" aria-current="page">
	                            List User
	                        </li>
	                    </ol>
	                </nav>
	                <h1 class="m-0">List User</h1>
	            </div>
	            <div class="ml-auto">
	                <a href="" class="btn btn-light"><i class="material-icons icon-16pt text-muted mr-1">settings</i>
	    Settings</a>
	            </div>
	        </div>
	    </div>
	</div>
</body>
