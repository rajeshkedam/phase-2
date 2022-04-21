package bookstore;

protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    String action = request.getServletPath();
 
    try {
        switch (action) {
        case "/new":
            showNewForm(request, response);
            break;
        case "/insert":
            insertBook(request, response);
            break;
        case "/delete":
            deleteBook(request, response);
            break;
        case "/edit":
            showEditForm(request, response);
            break;
        case "/update":
            updateBook(request, response);
            break;
        default:
            listBook(request, response);
            break;
        }
    } catch (SQLException ex) {
        throw new ServletException(ex);
    }
}