In place of this in Controller.java file---- <br>
@RequestMapping("add") <br>
public String add(HttpServletRequest req) { <br>
    int i = Integer.parseInt(req.getParameter("num1")); <br>
    int j = Integer.parseInt(req.getParameter("num2")); <br>
    int result = i + j; <br>
    HttpSession session = req.getSession(); <br>
    session.setAttribute("result", result); <br>
    return "result.jsp"; <br>
} <br>

We will write this Controller.java file---- <br>
public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2")int j) { <br>
		ModelAndView mv = new ModelAndView(); <br>
		mv.setViewName("result"); <br>
		int result = i+j; <br>
		mv.addObject("result", result); <br>
		return mv; <br>
	}
