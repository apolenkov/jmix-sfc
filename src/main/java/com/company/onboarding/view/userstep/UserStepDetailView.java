package com.company.onboarding.view.userstep;

import com.company.onboarding.entity.UserStep;

import com.company.onboarding.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "userSteps/:id", layout = MainView.class)
@ViewController("UserStep.detail")
@ViewDescriptor("user-step-detail-view.xml")
@EditedEntityContainer("userStepDc")
public class UserStepDetailView extends StandardDetailView<UserStep> {
}