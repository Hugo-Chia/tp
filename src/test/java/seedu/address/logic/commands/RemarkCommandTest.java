package seedu.address.logic.commands;

import org.junit.jupiter.api.Test;
import seedu.address.logic.Messages;
import seedu.address.model.Model;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;

public class RemarkCommandTest {

    private Model model;
    private Model expectedModel;

    @Test
    public void execute() {
        assertCommandFailure(new RemarkCommand(), model, Messages.MESSAGE_NOT_IMPLEMENTED_YET);
    }
}
