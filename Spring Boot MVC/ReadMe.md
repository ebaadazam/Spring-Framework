In place of this in Controller.java file----
@RequestMapping("add")
public String add(HttpServletRequest req) {
    int i = Integer.parseInt(req.getParameter("num1"));
    int j = Integer.parseInt(req.getParameter("num2"));
    int result = i + j;
    HttpSession session = req.getSession();
    session.setAttribute("result", result);
    return "result.jsp";
}

We will write this Controller.java file----
public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2")int j) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		int result = i+j;
		mv.addObject("result", result);
		return mv;
	}
